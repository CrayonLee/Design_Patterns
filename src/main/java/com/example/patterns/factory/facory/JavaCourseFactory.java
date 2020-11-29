package com.example.patterns.factory.facory;

import com.example.patterns.factory.ICourse;
import com.example.patterns.factory.JavaCourse;

/**
 * @author lzh
 * @create 2020-11-29 21:16
 **/
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}