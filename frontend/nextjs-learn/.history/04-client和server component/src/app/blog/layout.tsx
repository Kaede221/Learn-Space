import React from "react";

/**
 * 相当于页面的架子, 可以写一些固定的内容
 */
export default function BlogLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return <div>{children}</div>;
}
