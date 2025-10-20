package com.example.housekeeping_student.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String roomNo;

    private Long phoneNo;

    private String remarks;

    private java.sql.Date checkInDate;

    @Min(0) @Max(5)
    private Integer cleanlinessScore;



    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRoomNo() { return roomNo; }
    public void setRoomNo(String roomNo) { this.roomNo = roomNo; }

    public Long getPhoneNo() { return phoneNo; }
    public void setPhoneNo(Long phoneNo) { this.phoneNo = phoneNo; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }

    public java.sql.Date getCheckInDate() { return checkInDate; }
    public void setCheckInDate(java.sql.Date checkInDate) { this.checkInDate = checkInDate; }

    public Integer getCleanlinessScore() {
        return cleanlinessScore;
    }

    public void setCleanlinessScore(Integer cleanlinessScore) {
        this.cleanlinessScore = cleanlinessScore;
    }


}
