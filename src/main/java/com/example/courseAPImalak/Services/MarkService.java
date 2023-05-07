package com.example.courseAPImalak.Services;

import  com.example.courseAPImalak.Repositories.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkService {
    @Autowired
    MarkRepository markRepository;

    public Integer averageMark(String courseName) {
        Integer averageMark = markRepository.getAverageOfMarksByCourseName(courseName);
        return averageMark;
    }
}
