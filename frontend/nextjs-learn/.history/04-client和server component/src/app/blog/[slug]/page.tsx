/**
 * 这个叫做动态路由, 就是路由的一个参数是不固定的
 * 这个时候, 文件夹需要一个方括号括起来 这个可以理解为一种模板
 */

interface ISlugPage {
  slug: string;
}

// 这里的参数可以直接读取传入的参数 类似于下面这样
// 为了动态拿到参数, 需要是一个async函数, 然后使用await来读取数据 (AppRouter)
const Index = async ({ params }: { params: Promise<ISlugPage> }) => {
  const { slug } = await params;
  return (
    <div>
      <h1>Slug: {slug}</h1>
    </div>
  );
};

export default Index;
