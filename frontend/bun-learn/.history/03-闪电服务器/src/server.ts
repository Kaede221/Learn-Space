// 定义一个服务器并且启动
// 这是唯一的启动函数, 不需要像Node使用各种别的方法了
const server = Bun.serve({
  // NOTE 监听哪个端口
  port: 3000,

  // fetch是核心处理器, 只要有请求进来, bun就会调用这个方法
  // NOTE 这是整个服务器的“心脏”。它接收一个 Request 对象，必须返回一个 Response 对象（或者一个返回 Response 的 Promise）
  fetch: (request) => {
    console.log("收到了一个请求", request);

    // 需要返回一个标准的Response对象
    return new Response("Hello World From Bun Server!");
  },
});

// 直接打印启动信息即可, 因为上面的已经启动了
console.log(`服务启动成功, 正在监听: http://localhost:${server.port}`);
