package com.project.Photographer.repo;

import com.project.Photographer.model.Photographer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotographerRepo extends JpaRepository<Photographer, Integer> {
}
