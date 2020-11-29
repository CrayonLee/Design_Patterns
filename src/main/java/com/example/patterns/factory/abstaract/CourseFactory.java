package com.example.patterns.factory.abstaract;

/**
 * 抽象工厂是用户的主入口
 * 在Spring 中应用得最为广泛的一种设计模式
 * 易于扩展
 *
 * 如果我们再继续扩展产品等级，将源码Source 也加入到课程中，那么我们的
 * 代码从抽象工厂，到具体工厂要全部调整，很显然不符合开闭原则。因此抽象工厂也是
 * 有缺点的：
 *      1、规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂
 *      的接口。
 *      2、增加了系统的抽象性和理解难度。
 **/
public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}