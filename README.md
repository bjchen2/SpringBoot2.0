# SpringBoot2.0
慕课网，Spring Boot 2.0深度实践-初遇Spring Boot<br/>

- 一个SpringBoot2.0的demo,主要了解多模块以及Spring FrameWork5、SpringBoot2.0和Jdk1.8的一些新特性，比如lambda、函数式编程、web flux的支持。<br/>
**创建maven项目时记住勾选Web Flux**，默认嵌入式容器从为Netty（web为Tomcat）<br/>
&emsp;参考资料：<br/>
&emsp;&emsp;https://www.imooc.com/learn/933<br/>
**代码结构和视频刚开始时结构不同，因为在第三章多模块时进行了重构，代码无修改，可放心使用。**<br/>

- **代码写于：2018-05-03**<br/>
  &emsp;JDK：JDK1.8版本，<br/>
  &emsp;SpringBoot：2.0.1.RELEASE<br/>
  &emsp;IDE：IDEA 2017.3.3，<br/>
  &emsp;操作系统为：Windows10<br/>

- 重构时注意：<br/>
  重构时建立maven项目而不是Spring<br/>
  重构后pom中的build标签的所有内容应该移到主模块中去（本案例主模块是web）<br/>
  若要打包成war包，则需在主模块下创建了webapp/WEB-INF/web.xml文件<br/>

- 使用lombok包，减少代码冗余量，若不愿使用lombok包可将源码中所有bean的@Data注解去掉，加上get/set方法<br/>
