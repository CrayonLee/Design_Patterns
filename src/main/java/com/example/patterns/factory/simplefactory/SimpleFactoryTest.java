package com.example.patterns.factory.simplefactory;

import com.example.patterns.factory.ICourse;
import com.example.patterns.factory.JavaCourse;

/**
 * @author lzh
 * @create 2020-11-29 20:45
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        /*ICourse java = courseFactory.create("java");
        java.record();*/

       /* ICourse iCourse = courseFactory.create("com.example.patterns.factory.JavaCourse");
        iCourse.record();*/

        ICourse iCourse = courseFactory.create(JavaCourse.class);
        iCourse.record();
    }
}