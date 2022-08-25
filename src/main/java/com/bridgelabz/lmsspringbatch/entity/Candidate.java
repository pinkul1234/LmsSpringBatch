package com.bridgelabz.lmsspringbatch.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @Column(name = "")
    private Long id;
    @Column(name = "")
    private String cicId;
    @Column(name = "")
    private String fullName;
    @Column(name = "")
    private String email;
    @Column(name = "")
    private String mobileNum;
    @Column(name = "")
    private String hireDate;
    @Column(name = "")
    private String degree;
    @Column(name = "")
    private Double aggrPer;
    @Column(name = "")
    private String city;
    @Column(name = "")
    private String state;
    @Column(name = "")
    private String preferredJobLocation;
    @Column(name = "")
    private String status;
    @Column(name = "")
    private String passedOutYear;
    @Column(name = "")
    private String creatorUser;
    @Column(name = "")
    private String candidateStatus;
    @Column(name = "")
    private LocalDateTime creationTimeStamp;
    @Column(name = "")
    private LocalDateTime updatedTimeStamp;


}
