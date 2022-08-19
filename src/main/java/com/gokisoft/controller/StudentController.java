/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.controller;

import com.gokisoft.model.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DiepTV
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @GetMapping("/index.html")
    public String index(Model model) {
        model.addAttribute("msg", "Student Management Page");
        
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            studentList.add(new Student("Name " + i, i + "@gmail.com", "Ha Noi"));
        }
        
        model.addAttribute("studentList", studentList);
        model.addAttribute("index", 0);
        
        return "student/index";
    }
}
