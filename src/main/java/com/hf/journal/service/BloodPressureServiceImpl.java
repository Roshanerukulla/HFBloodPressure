
package com.hf.journal.service;

import com.hf.journal.entity.BloodPressure;
import com.hf.journal.repository.BloodPressureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BloodPressureServiceImpl implements BloodPressureService {
	  @Autowired
    private final BloodPressureRepository bloodPressureRepository;

  
    public BloodPressureServiceImpl(BloodPressureRepository bloodPressureRepository) {
        this.bloodPressureRepository = bloodPressureRepository;
    }

    @Override
    public void addBloodPressureRecord(BloodPressure bloodPressure) {
        bloodPressureRepository.save(bloodPressure);
    }

    @Override
    public List<BloodPressure> getBloodPressureByUserIdAndDate(Long userId, Date date) {
        return bloodPressureRepository.findByUserIdAndDate(userId, date);
    }

    @Override
    public List<BloodPressure> getBloodPressureByUserIdAndDateRange(Long userId, Date startDate, Date endDate) {
        return bloodPressureRepository.findByUserIdAndDateBetween(userId, startDate, endDate);
    }

    @Override
    public void updateBloodPressureRecord(Long recordId, BloodPressure updatedBloodPressure) {
        BloodPressure existingRecord = bloodPressureRepository.findById(recordId).orElse(null);
        if (existingRecord != null) {
            // Update fields that are not null in the updatedBloodPressure object
            if (updatedBloodPressure.getSystolic() != null) {
                existingRecord.setSystolic(updatedBloodPressure.getSystolic());
            }
            if (updatedBloodPressure.getDiastolic() != null) {
                existingRecord.setDiastolic(updatedBloodPressure.getDiastolic());
            }
            if (updatedBloodPressure.getPulse() != null) {
                existingRecord.setPulse(updatedBloodPressure.getPulse());
            }
            if (updatedBloodPressure.getWeight() != null) {
                existingRecord.setWeight(updatedBloodPressure.getWeight());
            }
            bloodPressureRepository.save(existingRecord);
        }
    }

    @Override
    public void deleteBloodPressureRecord(Long recordId) {
        bloodPressureRepository.deleteById(recordId);
    }

    @Override
    public void deleteBloodPressureRecordsByUserIdAndDate(Long userId, Date date) {
        bloodPressureRepository.deleteByUserIdAndDate(userId, date);
    }
}
