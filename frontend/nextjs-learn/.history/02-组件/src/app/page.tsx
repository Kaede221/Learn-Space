// 可以引入按钮组件
import MyButton from "@/components/MyButton";

export default function Home() {
  return (
    <div>
      <h1>Hello World</h1>
      {/*直接使用组件即可*/}
      <MyButton />
    </div>
  );
}
