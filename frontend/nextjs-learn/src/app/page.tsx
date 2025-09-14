import MyButton from "@/components/MyButton";
import Link from "next/link";

/*
Page 就是页面, 会嵌入 layout 中的对应位置
 */
export default function Home() {
  return (
    <div>
      <h1>Hello World</h1>

      {/*如果需要跳转路由, 则需要使用Link组件*/}
      <Link href="/blog">前往Blog页面</Link>
      <MyButton />
    </div>
  );
}
