package com.example.patterns.factory.abstaract;

/**
 * @author lzh
 * @create 2020-11-29 21:36
 **/
public class PythonCourseFactory implements CourseFactory {
    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}