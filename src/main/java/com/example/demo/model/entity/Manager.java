package com.example.demo.model.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="manager_id_seq")
    @SequenceGenerator(name="manager_id_seq", sequenceName="manager_id_seq", allocationSize=10)
    private Long id;
    private String name;
    private String phone;
}
