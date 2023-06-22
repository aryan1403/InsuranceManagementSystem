package com.takeo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection="INVENTORY_DETAILS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {


    @Id
    private String _id;

    @Field("USER")
    private String user;

    @Field("STOCK")
    private String stock;

    @Field("TYPE")
    private String type;   //sell or buy

    @Field("Price")
    private String price;

    @Field("QTY")
    private String qty;

	
    
}

