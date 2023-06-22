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
@Document(collection="User_Details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Field("UID")
    private int uid;

    @Field("FIRST_NAME")
    private String fisrtName;

    @Field("LAST_NAME")
    private String lastName;

    @Field("EMAIL")
    private String email;

    @Field("USER_NAME")
    private String userName;

    @Field("PASSWORD")
    private String passWord;

    @Field("BALANCE")
    private int balance;


    
}
