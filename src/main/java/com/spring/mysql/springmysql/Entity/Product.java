package com.spring.mysql.springmysql.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Products_Info-TBL")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message = "Name should not be empty")
    private String name;

    @Min(value=1,message = "Quantity should be greater than zero")
    private int quantity;
    private double price;
}
