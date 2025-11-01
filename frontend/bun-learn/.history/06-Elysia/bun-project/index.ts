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

// 最后, 启动服务器即可
app.listen(3000);
console.log(`Elysia 服务器正在 http://localhost:3000 上运行...`);
