// 首先 需要引入threeJS
import * as THREE from "three";

// 根据三个要素 我们创建出来
// 分别对应场景, 摄像机, 渲染器
// 这里定义为全局变量 方便直接通过不同的方法进行使用
let scene, camera, renderer;

// 初始化方法
const init = () => {
  // 创建场景对象
  scene = new THREE.Scene();

  // 创建摄像机
  /*
    这里的四个参数分别代表:
    角度 视野的垂直范围, 越大看到的越多, 物体就越小 推荐75左右
    宽高比 影响图形的拉伸/压缩 (只有和画布的宽高比一致 画出来的东西才一致, 否则就会出现变形的问题)
    近截面 近边界 推荐 0.1
    远截面 远边界 推荐 1000
     */
  camera = new THREE.PerspectiveCamera(
    75,
    window.innerWidth / window.innerHeight,
    0.1,
    1000,
  );

  // 把场景和摄像机给渲染器 渲染出来一个黑色的背景出来
  renderer = new THREE.WebGLRenderer();
  // 给渲染器设置最后绘制多大的内容 设置画布大小
  renderer.setSize(window.innerWidth, window.innerHeight);

  // 绘制完毕 添加到页面上 这个画布就是一个canvas
  document.body.appendChild(renderer.domElement);

  // 随后 传入场景和摄像机 渲染你画面
  renderer.render(scene, camera);
};

// 调用初始化方法
init();
