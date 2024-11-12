package com.marcelo_rest_service.rest_services.users;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class User {
    private Integer id;
    @Schema(description = "Name should have at least 2 characters.")
    @Size(min=2, message="Name should have at least 2 characters.")
    private String name;

    @Schema(description = "Date should not be in the past.")
    @Past
    private Date dayOfBirth;

    public User(int id, String name, Date dayOfBirth) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }
}
