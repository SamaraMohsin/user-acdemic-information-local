package com.capstone.useracdemicinformation.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_academic_information")
public class CandidateAcademicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private Long userId;
    @Setter
    private String currentDegree;
    @Setter
    private String title;
    @Setter
    private String institute;
    @Setter
    private String degreeProgress;

    @Setter
    @Column(columnDefinition = "date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date graduationDate;
    @Setter
    private String cgpa; //marks
    @Setter
    private String finalYearProject;


}
