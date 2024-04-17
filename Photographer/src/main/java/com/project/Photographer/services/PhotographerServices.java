package com.project.Photographer.services;

import com.project.Photographer.model.Photographer;
import com.project.Photographer.repo.PhotographerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotographerServices {

    @Autowired
    PhotographerRepo photographerRepo;
    public String addUser(Photographer photographer) {

        try {
            photographerRepo.save(photographer);
            return "Added Successfully";
        }catch (Exception e){
            return "something went wrong";
        }

    }
}
