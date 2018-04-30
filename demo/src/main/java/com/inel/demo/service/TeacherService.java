package com.inel.demo.service;

import com.inel.demo.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class TeacherService {
    public List<Teacher> getAllTeachers(){
        List<Teacher> listTeachers=new ArrayList<>();
        listTeachers.add(new Teacher(1,"Jhonny"));
        listTeachers.add(new Teacher(2,"Pepe"));
        listTeachers.add(new Teacher(3,"Jorge"));
        return listTeachers;
    }



}

