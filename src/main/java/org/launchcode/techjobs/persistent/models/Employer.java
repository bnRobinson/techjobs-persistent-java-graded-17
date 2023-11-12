package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min=1, max=100)
    private String location;

    //Task 3- add jobs field
    @OneToMany(mappedBy= "employer")
    @JoinColumn
    private final List<Job> jobs= new ArrayList<>();

    public String getLocation() {
        return location;
    }
    public Employer(String location){
        this.location=location;
    }
    public Employer() {
    }

}
