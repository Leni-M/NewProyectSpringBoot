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
    private static final List<Teacher> listTeacher=new ArrayList<>();

    public TeacherService(){
        listTeacher.add(new Teacher(0,"Rudy"));
        listTeacher.add(new Teacher(1,"Carlitos"));
        listTeacher.add(new Teacher(2,"Jorgito"));
        listTeacher.add(new Teacher(3,"Noemi"));
    }
    //Metod CRUD
    //List Teachers
    public List<Teacher> getAllTeachers(){
        //get all teacher from DB
        return listTeacher;
    }

    //Add new Teacher
    public void addNewTeacher(Teacher newTeacher){
        //insert new Teacher into DB
        listTeacher.add(newTeacher);
    }

    //Delete Teacher by ID
    public void deleteTeacher(int id){
        //delete a teacher by  id in DB
        listTeacher.remove(id);
    }

    //Get a teacher By ID
    public Teacher getTeacherById(int id){
        // get a Teacher by id from DB
        return listTeacher.get(id);
    }

    /**
     *      public TeacherService(){
     *         listTeacher.add(new Teacher(1,"Rudy"));
     *         listTeacher.add(new Teacher(2,"Carlitos"));
     *         listTeacher.add(new Teacher(3,"Jorgito"));
     *         listTeacher.add(new Teacher(4,"Noemi"));
     *      }

    public List<Teacher> getAllTeacher(){
        return listTeacher;
    }

    public void deleteTeacher(long id){
        System.out.println("Teacher to Telete: "+listTeacher.get((int)id));
    }

    public void addTeacher(Teacher teacher){
        listTeacher.add(teacher);
        System.out.println("teacher to add is: "+teacher.getName());
    }

    public void updateTeacher(Teacher teacher,long id){
        listTeacher.set((int)(id),teacher);
        System.out.println("update Teacher is:"+listTeacher);
    }

    public Teacher getById(long id){
        System.out.println("Techer is: "+listTeacher);
        return listTeacher.get((int)id);
    }

    */
}

