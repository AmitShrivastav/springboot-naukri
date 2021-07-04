package com.refwise.naukri.naukri.entity;


import javax.persistence.*;

@Table(name = "naukri_skill")
@Entity
public class NaukriSkill {

    public NaukriSkill() {
    }
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private String skill;

    private String location;

    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NaukriSkill{" +
                "id=" + id +
                ", skill_name='" + skill + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
