package com.inel.demo.web;

import com.inel.demo.domain.Teacher;
import com.inel.demo.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jhonny on 5/18/17.
 */
@RestController
@RequestMapping("/teacher")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")

public class TeacherController {
        //dependencia inyection
        @Autowired
        private TeacherService teacherService;

        //Get all teacher
        @RequestMapping(method = RequestMethod.GET)
        public List<Teacher> getAllTeacher(){
                return teacherService.getAllTeachers();
        }

        @RequestMapping(path = "/{id}",method = RequestMethod.GET)
        public Teacher getTeacherById(@PathVariable int id){
                return teacherService.getTeacherById(id);
        }

        //insert new Teacher
        @RequestMapping(method = RequestMethod.POST)
        public void addNewTeacher(@RequestBody Teacher newTeacher){
                System.out.println("the Name od new Teacher is "+newTeacher.getName());
                teacherService.addNewTeacher(newTeacher);
        }

        //delete Teacher : localhost:8080/teacher/2
        @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
        public void deleteTeacher(@PathVariable int id){
                System.out.println("the Id delete is: "+id);
                teacherService.deleteTeacher(id);
        }

        // delete Teacher by ID using Request Body
        @RequestMapping(method = RequestMethod.DELETE)
        public  void deleteTeacherByReq(@RequestBody Teacher teacher){
                System.out.println("the id of teacher to delete is "+teacher.getId());
                teacherService.deleteTeacher((int) teacher.getId());
        }

}
