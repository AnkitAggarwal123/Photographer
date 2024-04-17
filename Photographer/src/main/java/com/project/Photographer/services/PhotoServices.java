package com.project.Photographer.services;

import com.project.Photographer.model.Photo;
import com.project.Photographer.repo.IPhoto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PhotoServices {

    @Autowired
    IPhoto iPhoto;
    public String addPhoto(Photo photo) {
        try{
            iPhoto.save(photo);
            return "Post Successfully";
        }catch (Exception e){
            return "something went wrong";
        }

    }

    public String delete(Photo photo) {
        try{
            iPhoto.delete(photo);
            return "delete Successfully";
        }catch (Exception e){
            return "something went wrong";
        }
    }

    public List<Photo> getAll() {

        ArrayList arrayList = new ArrayList<>();

        try{
            return iPhoto.findAll();
        }catch (Exception e){
            return arrayList;
        }
    }
}
