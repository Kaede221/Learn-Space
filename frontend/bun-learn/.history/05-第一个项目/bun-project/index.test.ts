import { test, expect, describe } from "bun:test";

// 可以测试简单的JS
test("2+2应该等于4", () => {
  expect(2 + 2).toBe(4);
});

// 也可以使用describe进行分组
describe("字符串测试", () => {
  test("kaede大写后应该变为KAEDE", () => {
    expect("kaede".toUpperCase()).toBe("KAEDE");
  });

  test("A 字符串和 B 字符串拼接后, 可以得到 AB 字符串.", () => {
    expect("A" + "B").toBe("AB");
  });
});


// 需要测试的时候 直接运行 bun test 即可.