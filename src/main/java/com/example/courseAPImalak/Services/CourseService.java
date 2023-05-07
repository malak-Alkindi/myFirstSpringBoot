package com.example.courseAPImalak.Services;

import  com.example.courseAPImalak.Models.Course;
import  com.example.courseAPImalak.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course getCourseById(Integer id){
        Course course = courseRepository.getById(id);
        return course;
    }
}
