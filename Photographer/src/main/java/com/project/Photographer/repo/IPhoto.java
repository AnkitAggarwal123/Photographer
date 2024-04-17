package com.project.Photographer.repo;

import com.project.Photographer.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoto extends JpaRepository<Photo, Integer> {
}
