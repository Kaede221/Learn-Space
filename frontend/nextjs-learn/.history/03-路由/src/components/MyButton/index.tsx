import { FC } from "react";

/**
 * 自定义按钮组件
 * 组件一般都放在 src/components 目录下, 可以新建文件夹+index文件名, 或者组件名.tsx文件
 * 组件的文件名一般都要大写开头, 比如 MyButton, MyInput 等
 */
const MyButton: FC = () => {
  return (
    <div className="inline-flex items-center justify-center rounded-md bg-blue-500 px-4 py-2 text-white">
      按钮
    </div>
  );
};

export default MyButton;
