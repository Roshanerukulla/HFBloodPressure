package com.hf.journal.repository;


import com.hf.journal.entity.BloodPressure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BloodPressureRepository extends JpaRepository<BloodPressure, Long> {

    List<BloodPressure> findByUserIdAndDate(Long userId, Date date);

    List<BloodPressure> findByUserIdAndDateBetween(Long userId, Date startDate, Date endDate);

	void deleteByUserIdAndDate(Long userId, Date date);

    // Add other custom query methods as needed
}
