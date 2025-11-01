# 安装速度测试

可以通过如下命令, 在Windows计算时间:

```bash
Measure-Command {npm install}
```

执行结果如下:

```txt
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 5
Milliseconds      : 693
Ticks             : 56939518
TotalDays         : 6.59022199074074E-05
TotalHours        : 0.00158165327777778
TotalMinutes      : 0.0948991966666667
TotalSeconds      : 5.6939518
TotalMilliseconds : 5693.9518
```

随后测试使用 bun 进行依赖安装

```bash
Measure-Command {bun install}
```

得到的时间如下:

```txt
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 1
Milliseconds      : 593
Ticks             : 15933780
TotalDays         : 1.8441875E-05
TotalHours        : 0.000442605
TotalMinutes      : 0.0265563
TotalSeconds      : 1.593378
TotalMilliseconds : 1593.378
```

# 测试速度测试

首先安装一个 jest 用来测试:

```bash
bun add -D jest
```

bun 的数据表单:

```txt
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 0
Milliseconds      : 198
Ticks             : 1984559
TotalDays         : 2.29694328703704E-06
TotalHours        : 5.51266388888889E-05
TotalMinutes      : 0.00330759833333333
TotalSeconds      : 0.1984559
TotalMilliseconds : 198.4559
```

jest 的数据表单:

```txt
Days              : 0
Hours             : 0
Minutes           : 0
Seconds           : 0
Milliseconds      : 545
Ticks             : 5455208
TotalDays         : 6.31389814814815E-06
TotalHours        : 0.000151533555555556
TotalMinutes      : 0.00909201333333333
TotalSeconds      : 0.5455208
TotalMilliseconds : 545.5208
```

由此可以看到, bun确实非常快了.