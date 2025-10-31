/**
 * 目标是实现一个**“路由” (Routing)**。虽然 Bun 本身很底层，但我们可以用 if 语句或 switch 轻松实现。
 * 需要让服务器根据不同的 URL 路径 (path) 返回不同的内容
 * 如果访问 http://localhost:3000/ (根路径)，返回 <h1>欢迎来到首页!</h1>
 * 如果访问 http://localhost:3000/api，返回你之前做的那个 JSON 对象
 * 如果访问其他任何路径 (如 /hello, /foo)，返回 404 - Not Found 文本，并且状态码应为 404
 */

const server = Bun.serve({
  port: 3002,
  fetch: (req) => {
    // NOTE 可以使用URL对象解析字符串
    const url = new URL(req.url);

    // 这样就可以拿到路径部分了
    const path = url.pathname;

    // 根据path判断需要返回什么
    if (path === "/") {
      return new Response("<h1>欢迎来到首页!</h1>", {
        headers: {
          // NOTE 必须在 Content-Type 头部中，明确地告诉浏览器：“嘿！请使用 UTF-8 来阅读我！”
          "Content-Type": "text/html; charset=utf-8",
        },
      });
    } else if (path === "/api") {
      return Response.json({ name: "Kaede" });
    }

    return new Response("<h1>404 Error</h1>", {
      headers: {
        "Content-Type": "text/html; charset=utf-8",
      },
      status: 404,
    });
  },
});

console.log(`server is on: http://localhost:${server.port}`);
