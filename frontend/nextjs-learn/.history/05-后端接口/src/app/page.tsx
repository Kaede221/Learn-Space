/*
NextJS 提供了后端API, 这也是为什么NextJS 可以实现SSR的原因.
只需要在app目录下, 新建一个api目录, 就可以创建后端API了.
在api目录下, 新建一个文件, 文件名就是API的路由.
比如, 我要创建一个 /api/hello 的API, 那么我就需要在api目录下:
1. 首先新建 hello 目录
2. 创建 route.ts 文件
这里很重要, 不能直接 hello.ts, 否则无法访问
 */
const Index = async () => {
  // 可以直接访问我们前端定义的API接口
  const res = await fetch("http://localhost:3000/api/hello");
  const data = await res.json();

  return (
    <div>
      <h1>Hello World</h1>
      <h2>{data.message}</h2>
    </div>
  );
};

export default Index;
