package com.example.Course.Service;



import org.springframework.stereotype.Service;
import com.example.Course.Implementation.CourseImplementation;




public class CourseService {




    public String retrieveCourseReversed(String Course){
        CourseImplementation courseImplementation = null;
        System.out.println("Inside service");
        String reversedCourse  =courseImplementation.returnCoursereversed(Course);
        return reversedCourse;
    }

    public  String retrieveCourselength(String Course){
        CourseImplementation courseImplementation = null;
        String length  = courseImplementation.returnCourseLength(Course);
        return length;
    }

}
