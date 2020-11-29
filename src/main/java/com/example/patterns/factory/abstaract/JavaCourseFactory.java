package com.example.patterns.factory.abstaract;

/**
 *
 * 创建Java 产品族的具体工厂JavaCourseFactory
 * @author lzh
 * @create 2020-11-29 21:33
 **/
public class JavaCourseFactory implements CourseFactory{
    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}