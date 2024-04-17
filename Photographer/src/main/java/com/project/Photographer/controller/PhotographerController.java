package com.project.Photographer.controller;

import com.project.Photographer.model.Photographer;
import com.project.Photographer.services.PhotographerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PhotographerController {

    @Autowired
    PhotographerServices photographerServices;

    @PostMapping("user")
    private String addUser(@RequestBody Photographer photographer){
        return photographerServices.addUser(photographer);
    }




}
