import type { Metadata } from "next";
import React from "react";

import "./globals.css";

/*
layout 决定了页面的基本布局, 相当于整个浏览器窗口部分
可以在这里定义浏览器页面相关的信息
 */

export const metadata: Metadata = {
  title: "这是网站标题",
  description: "这是网站介绍",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="zh">
      <body>{children}</body>
    </html>
  );
}
