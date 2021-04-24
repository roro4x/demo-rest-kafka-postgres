package com.example.demo.model.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="client_id_seq")
    @SequenceGenerator(name="client_id_seq", sequenceName="client_id_seq", allocationSize=10)
    private Long id;
    private String name;
    private String phone;
    @Column(name = "birthdate")
    private String birthDate;
}
