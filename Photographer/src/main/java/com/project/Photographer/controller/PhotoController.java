package com.project.Photographer.controller;

import com.project.Photographer.model.Photo;
import com.project.Photographer.services.PhotoServices;
import com.project.Photographer.services.PhotographerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PhotoController {

    @Autowired
    PhotoServices photoServices;

    @PostMapping("photo")
    private String addPhoto(@RequestBody Photo photo){
         return photoServices.addPhoto(photo);
    }

    @DeleteMapping("photo")
    private String delete(Photo photo){
        return  photoServices.delete(photo);
    }

    @GetMapping("photos")
    private List<Photo> allPhotos(){
        return photoServices.getAll();
    }

}
