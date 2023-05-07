package com.example.courseAPImalak.Controllers;

import com.example.courseAPImalak.Models.School;
import  com.example.courseAPImalak.Services.SchoolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolController {


    @Autowired
    SchoolService schoolService;





    //localhost:8080/school/getAll

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<School> getAllSchools() {
        List<School> schools = new ArrayList<>();
        schools = schoolService.getAllSchools();

        return schools;
    }


    @GetMapping(value = "getById")
    public School getSchoolById(@RequestParam Integer schoolId) {
        School school = schoolService.getSchoolById(schoolId);
        return school;
    }

    @RequestMapping(value = "getByName")
    public School getSchoolByName(@RequestParam String schoolName) {
        School school = schoolService.getSchoolByName(schoolName);
        return school;
    }

    @RequestMapping(value = "getAllSchoolByIsActive")
    public List<School> getAllActiveSchools() {
        List<School> activeSchoolsList = schoolService.getAllActiveSchools();

        return activeSchoolsList;
    }




    @RequestMapping(value = "getSchoolByNumberOfStudent")
    public List<School> getSchoolByNumberOfStudent(@RequestParam Integer numberOfStudent) {
       List<School> schoolList=schoolService.getSchoolByNumberOfStudent(numberOfStudent);

       return schoolList;
    }



}

