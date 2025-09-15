import { NextResponse } from "next/server";

// 可以这样直接实现一个后端接口
export async function GET(req: Request) {
  console.log("请求参数为", req);
  return NextResponse.json({
    message: "Hello World From API",
  });
}
