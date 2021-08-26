package com.example.Course.Controller;


import com.example.Course.Implementation.CourseImplementation;
import com.example.Course.Service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/course")
@CrossOrigin("*")
public class CourseController {

//    CourseService courseService;



    @RequestMapping(value = "/getCourse/{course}/{operation}",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<?> getCourse(@PathVariable("course") String course,@PathVariable("operation") Integer operation){
        CourseImplementation courseImplementation = new CourseImplementation();
        System.out.println(operation);
        

        List<String> courseList = new ArrayList<String>();
        String courseLength = "";
        String reversedCourse = "";
        System.out.println(course);
        if (operation == 1) {
            courseLength = courseImplementation.returnCourseLength(course);
            courseList.add(courseLength);
        }
        if(operation ==2) {
            reversedCourse = courseImplementation.returnCoursereversed(course);
            courseList.add(reversedCourse);
        }
        if(operation ==3 ){
            boolean containsSpecialCharacter = courseImplementation.returnContainsSpecialCharacter(course);
            courseList.add(containsSpecialCharacter + "");

        }


        

        return new ResponseEntity(courseList, HttpStatus.OK);




    }


}
