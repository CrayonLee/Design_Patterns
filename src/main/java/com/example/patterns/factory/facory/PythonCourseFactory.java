package com.example.patterns.factory.facory;

import com.example.patterns.factory.ICourse;
import com.example.patterns.factory.PythonCourse;

/**
 * @author lzh
 * @create 2020-11-29 21:17
 **/
public class PythonCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}