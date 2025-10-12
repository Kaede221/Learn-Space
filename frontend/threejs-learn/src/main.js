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
};

/**
 * 绘制小正方体
 */
const createCube = () => {
  /*
  如果我们想要绘制一个立方体的话 那么我们需要告诉ThreeJS一些信息:
  - 绘制的是什么图形
  - 材质, 颜色是什么
  - 网格, 物体的本身, 需要传入图形和材质
  - 最后, 把物体添加到场景里面就行

  在threejs中, 坐标轴是右手坐标系
   */
  // 创建图形 (立方缓冲几何体)
  const geometry = new THREE.BoxGeometry(1, 1, 1);
  // 创建材质 这里使用的是简单的基础材质 (网格基础材质, 使用线+面+纯颜色描绘表面)
  const material = new THREE.MeshBasicMaterial({ color: 0x6495ED });
  // 创建物体网格 (网格物体对象)
  const cube = new THREE.Mesh(geometry, material);

  // 添加物体到场景中
  scene.add(cube);

  // 因为摄像机和物体重合了, 并且物体是单面渲染的, 所以需要移动一下摄像机 (也可以创建完相机再进行移动)
  camera.position.z = 5;
};

// 调用初始化方法
init();

// 创建立方体
createCube();

// 最后进行渲染 不然没有效果
// 因为渲染是一次新的, 不会因为有变化就重新渲染.
renderer.render(scene, camera);
