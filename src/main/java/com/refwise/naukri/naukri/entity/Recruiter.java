package com.refwise.naukri.naukri.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Table(name = "recruiter")
@Entity
public class Recruiter {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    String recruiterName;

    String recruiterLocation;
    String recruiterImg;
    String recruiterCompName;
    String recruiterSkill;
    String updateBy;
    Date updatedDate;
    Date createdDate;
    String createdBy;
    int follower;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recruiter recruiter = (Recruiter) o;
        return id == recruiter.id && recruiterName.equals(recruiter.recruiterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recruiterName);
    }

    @Override
    public String toString() {
        return "Recruiter{" +
                "id=" + id +
                ", recruiterName='" + recruiterName + '\'' +
                ", recruiterLocation='" + recruiterLocation + '\'' +
                ", recruiterCompName='" + recruiterCompName + '\'' +
                ", recruiterSkill='" + recruiterSkill + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updatedDate=" + updatedDate +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", follower=" + follower +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecruiterName() {
        return recruiterName;
    }

    public void setRecruiterName(String recruiterName) {
        this.recruiterName = recruiterName;
    }

    public String getRecruiterLocation() {
        return recruiterLocation;
    }

    public void setRecruiterLocation(String recruiterLocation) {
        this.recruiterLocation = recruiterLocation;
    }

    public String getRecruiterCompName() {
        return recruiterCompName;
    }

    public void setRecruiterCompName(String recruiterCompName) {
        this.recruiterCompName = recruiterCompName;
    }

    public String getRecruiterSkill() {
        return recruiterSkill;
    }

    public void setRecruiterSkill(String recruiterSkill) {
        this.recruiterSkill = recruiterSkill;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public String getRecruiterImg() {
        return recruiterImg;
    }

    public void setRecruiterImg(String recruiterImg) {
        this.recruiterImg = recruiterImg;
    }
}
