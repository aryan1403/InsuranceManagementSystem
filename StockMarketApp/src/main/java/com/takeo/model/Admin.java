package com.takeo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EntityScan
@Document(collection="ADMIN_DETAILS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Admin {

    @Id 
    @Field("AID")
    private int aid;

    @Field("FNAME")
    private String fName;

    @Field("LNAME")
    private String lName;

    @Field("EMAIL")
    private String email;

    @Field("PASSWORD")
    private String password;

    @Field("USERNAME")
    private String username;
    
}

