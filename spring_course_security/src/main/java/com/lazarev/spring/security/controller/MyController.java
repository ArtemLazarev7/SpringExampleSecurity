/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lazarev.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ArtemLazarev
 */
@Controller
public class MyController {
    
    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view_for_all_employees";
    }
    
    @GetMapping("/hr_info")
    public String getInfoOnlyForHr(){
        return "view_for_hr";
    }
    
    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers(){
        return "view_for_managers";       
    }
}
