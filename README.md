# baiduwp-springboot
（项目已完蛋）

根据baiduwp-php改造，目前只写了接口部分。

会更新前端部分以及数据库部分。

学java没多久，语法简陋。

讲真java做这个比php麻烦很多。

记得更新pom文件。


# 使用方法

1.启动Springboot类

2.访问接口localhost:8080/checkin
        
        参数surl //就是链接/s/后面的一串
        参数pwd  //提取码
3.例如:localhost:8080/checkin?surl=1bBH9G3Q5M-7UV-bhvQ_dsg&pwd=bazh

4.反馈如下：![Image text](https://s1.ax1x.com/2020/10/03/03qhj0.png)


【2020.10.03新增】可以批量提取多文件的链接了，暂不支持文件夹。

【2020.10.03新增】对接了Springboot，可以扩展接口业务了。

Thanks：
[baiduwp-php](https://github.com/yuantuo666/baiduwp-php)
