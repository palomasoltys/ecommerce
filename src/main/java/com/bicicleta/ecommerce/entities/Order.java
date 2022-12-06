package com.bicicleta.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String orderTrackingNumber;

    @Column
    private int totalQuantity;

    @Column
    private double totalPrice;

    @Column
    private String status;

    @Column
    @CreatedDate
    private Date dateCreated;

    @Column
    @LastModifiedDate
    private Date lastUpdated;

    @ManyToOne
    @JsonBackReference
    private User user;

}