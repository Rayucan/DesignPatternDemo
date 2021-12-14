package com.rayucan.designparttern.StructuralPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 22:02
 */
public class Student {
    private final int id;
    private final String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private static final Map<String, Student> cache = new HashMap<>();
    

    public static Student create(int id, String name){
        String key = id + "\n" + name;
        Student student = cache.get(key);
        
        if (student == null){
            student = new Student(id, name);
            System.out.println("create new student:" + student.name);
        }else {
            System.out.println("student found in cache:" + student.name);
        }
        
        return student;
    }
}
 