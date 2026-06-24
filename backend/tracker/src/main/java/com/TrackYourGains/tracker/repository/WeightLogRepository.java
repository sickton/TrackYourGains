package com.TrackYourGains.tracker.repository;

import com.TrackYourGains.tracker.entity.WeightLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeightLogRepository extends JpaRepository<WeightLog, Long> {

    List<WeightLog> findByUserId(Long userId);
}
