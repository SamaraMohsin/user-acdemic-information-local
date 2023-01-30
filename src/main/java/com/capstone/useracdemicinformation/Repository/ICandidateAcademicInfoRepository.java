package com.capstone.useracdemicinformation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.useracdemicinformation.Model.CandidateAcademicInfo;

public interface ICandidateAcademicInfoRepository extends JpaRepository<CandidateAcademicInfo,Long> {

    public List<CandidateAcademicInfo> findAllByUserId(Long userId);
}
