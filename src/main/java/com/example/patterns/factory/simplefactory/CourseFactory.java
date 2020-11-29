package com.example.patterns.factory.simplefactory;

import com.example.patterns.factory.ICourse;
import com.example.patterns.factory.JavaCourse;
import com.example.patterns.factory.PythonCourse;

/**
 * 简单工厂模式：
 *  在JDK中的应用场景：
 *      Calendar中的getInstance()方法
 *      LoggerFactory中多个重载的getLogger()方法
 *
 * 缺点：
 *  工厂的职责相对过重,不易于扩展过于复杂的产品结构。
 *
 * @author lzh
 * @create 2020-11-29 20:44
 **/
public class CourseFactory {
    /*public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }
    }*/



   /* //对简单工厂继续进行优化，这里我们采用发射技术
    public ICourse create(String className) {
        try {
            if(!(null==className||"".equals(className))){
                return ((ICourse) Class.forName(className).newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    /*
    * 优化之后，产品不断丰富不需要修改CourseFactory 中的代码。但是，有个问题是，方
    法参数是字符串，可控性有待提升，而且还需要强制转型。
    * */
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if(clazz != null){
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}