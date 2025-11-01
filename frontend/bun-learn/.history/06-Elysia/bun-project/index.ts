// 使用 elysia 创建一个简单的API
import { Elysia, t } from "elysia";

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

// 对于POST方法, 差不多, 不过数据是存在body里面的了
app.post(
  "/users",
  (content) => {
    // body 是一个Promise, 所以需要使用await
    // 但是一旦加上了下面的类型校验, 就不需要使用promise了, 所以这里就没有await之类的东西了
    const userData = content.body;

    // 发一些数据回去,进行验证
    return {
      status: 200,
      receivedData: userData,
    };
  },
  // 可以直接进行类型校验, 这样上面使用的时候, 就知道具体的类型了, 并且服务会自动进行校验, 类型不匹配就会报错
  {
    body: t.Object({
      username: t.String({ minLength: 3 }),
    }),
  }
);

// 最后, 启动服务器即可
app.listen(3000);
console.log(`Elysia 服务器正在 http://localhost:3000 上运行...`);
