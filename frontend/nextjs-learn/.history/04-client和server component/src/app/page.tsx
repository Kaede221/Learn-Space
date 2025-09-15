"use client"; // 告诉NextJS, 这是用户端渲染页面

import MyButton from "@/components/MyButton";
import Link from "next/link";

/*
NextJS中, component分为了 client component 和 server component 两种.
client component 会返回HTML+CSS+JS, 交给浏览器渲染

而server component, 会直接进行渲染, 然后展示. NextJS 默认来说都是 server component.
如果要定义 client component, 只需要在最开始的地方, 使用单引号就行.

server component 就是快一些, 因为渲染需要耗费时间; 另外体积也会小很多.
不过 client component 有 JS的代码, server component 是一个静态的内容, 无法实现丰富的交互效果.
所以我们还是需要 client component.

这里记住最小化原则, 能不用 client component 就不用 client component, 除非实在不行了.
 */
export default function Home() {
  return (
    <div>
      <h1>Hello World</h1>

      {/*如果需要跳转路由, 则需要使用Link组件*/}
      <Link href="/blog">前往Blog页面</Link>

      {/*这里的MyButton组件, 是一个server component, 但是因为是被client component引用的, 所以也变成了client component*/}
      <MyButton />
    </div>
  );
}
