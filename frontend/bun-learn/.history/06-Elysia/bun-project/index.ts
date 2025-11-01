// 使用 elysia 创建一个简单的API
import Elysia from "elysia";

// 创建一个elysia实例
const app = new Elysia();

// 开始定义我们的各种路由
app.get("/", () => {
  // 这代表 通过get访问这个路径的时候, 会返回这个字符串
  return "Hello World From Elysia!";
});

// 当然, 也可以定义别的路由
app.get("/api", () => {
  // Elysia会自动帮我们返回json, 不需要进行额外处理
  return {
    message: "Welcome To Elysia.JS API!",
    teacher: "Gemini",
    student: "Kaede",
  };
});

// 可以实现动态路由
app.get("/users/:id", (content) => {
  // 会自动解析, 放入 content.params
  const userId = content.params.id;

  return {
    message: `你正在访问 ID = ${userId} 的用户信息.`,
  };
});

// 也可以添加查询参数
app.get("/search", (content) => {
  // 查询参数会自动放入 query 中
  // 这里的q就是说, 需要有一个q的查询参数
  const { q } = content.query;
  if (!q) {
    return "请使用查询参数 q";
  }
  return {
    message: "你的参数为: " + q,
  };
});

// NOTE Exercise 综合练习
app.get("/greet/:name", (content) => {
  const { name } = content.params;
  const { title } = content.query;
  if (name && !title) {
    return `你好, ${name}!`;
  } else if (name && title) {
    return `你好, ${title} ${name}!`;
  }
  return "至少需要使用name参数";
});

// 最后, 启动服务器即可
app.listen(3000);
console.log(`Elysia 服务器正在 http://localhost:3000 上运行...`);
