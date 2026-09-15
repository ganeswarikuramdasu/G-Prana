package com.gprana.repository;

import com.gprana.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, String> {
    List<Complaint> findAllByOrderByCreatedAtDesc();

    List<Complaint> findByComplainantUserIdOrderByCreatedAtDesc(String complainantUserId);

    List<Complaint> findByRelatedPatientIdOrderByCreatedAtDesc(String relatedPatientId);

    List<Complaint> findByRelatedDoctorIdOrderByCreatedAtDesc(String relatedDoctorId);

    long countByStatus(String status);
}