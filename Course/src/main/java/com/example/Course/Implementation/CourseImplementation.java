package com.example.Course.Implementation;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CourseImplementation {

    public String returnCoursereversed(String course){
        String output = "";
        for (int i = course.length() - 1; i >= 0; i--) {
            output = output + course.charAt(i);
        }
        return output;
    }
    public String returnCourseLength(String course){
        return course.length() + "";
    }
    public boolean returnContainsSpecialCharacter(String course){

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(course);
        boolean result = matcher.find();
        return  result;
    }
}
