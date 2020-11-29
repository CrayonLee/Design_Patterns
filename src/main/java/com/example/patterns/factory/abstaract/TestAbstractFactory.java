package com.example.patterns.factory.abstaract;

/**
 * @author lzh
 * @create 2020-11-29 21:38
 **/
public class TestAbstractFactory{
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNote().edit();
        pythonCourseFactory.createVideo().record();

    }
}