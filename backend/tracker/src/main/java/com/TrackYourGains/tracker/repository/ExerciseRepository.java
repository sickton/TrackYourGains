package com.TrackYourGains.tracker.repository;

import com.TrackYourGains.tracker.entity.Exercise;
import com.TrackYourGains.tracker.enums.Category;
import com.TrackYourGains.tracker.enums.Equipment;
import com.TrackYourGains.tracker.enums.MuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findByMuscleGroup(MuscleGroup muscleGroup);
    List<Exercise> findByCategory(Category category);
    List<Exercise> findByEquipment(Equipment equipment);
}
