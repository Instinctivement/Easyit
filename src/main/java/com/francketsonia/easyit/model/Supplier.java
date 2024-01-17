package com.francketsonia.easyit.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
@NoArgsConstructor
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierID;

    @Column(length = 50)
    private String supplier_name;

    @Column(length = 50)
    private String supplier_address;

    @Column(length = 15)
    private String supplier_phone;

}
