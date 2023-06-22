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
@Document(collection="STOCK_DETAILS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    @Id 
    @Field("SID")
    private int sid;

    @Field("SNAME")
    private String sname;

    @Field("PRICE")
    private int price;

    @Field("QUANTITY")
    private int quantity;
    
}

