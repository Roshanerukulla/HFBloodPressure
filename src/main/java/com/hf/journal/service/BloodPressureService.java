package com.hf.journal.service;



import com.hf.journal.entity.BloodPressure;

import java.util.Date;
import java.util.List;

public interface BloodPressureService {
    void addBloodPressureRecord(BloodPressure bloodPressure);
    List<BloodPressure> getBloodPressureByUserIdAndDate(Long userId, Date date);
    List<BloodPressure> getBloodPressureByUserIdAndDateRange(Long userId, Date startDate, Date endDate);
    void updateBloodPressureRecord(Long recordId, BloodPressure updatedBloodPressure);
    void deleteBloodPressureRecord(Long recordId);
    void deleteBloodPressureRecordsByUserIdAndDate(Long userId, Date date);
}
