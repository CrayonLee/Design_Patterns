package com.example.patterns.factory.facory;

import com.example.patterns.factory.ICourse;

/**
 * @author lzh
 * @create 2020-11-29 21:18
 **/
public class SimpleCorseFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();
        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }
}