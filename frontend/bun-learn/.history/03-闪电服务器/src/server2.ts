// 无论如何, 我们的服务器更多的会直接返回一个json. 使用Response对象会让这个变得更加轻松
const server = Bun.serve({
  port: 3001,
  fetch: (request) => {
    /** NOTE
     * Response.json() 是一个便捷的辅助函数
     * 它会自动:
     * 1. 将 JS 对象序列化 (JSON.stringify)
     * 2. 设置正确的 'Content-Type: application/json' 头部
     */
    return Response.json({
      name: "Kaede",
      age: 19,
    });
  },
});

console.log(`服务启动成功: http://localhost:${server.port}`);
