package com.example.demo.model.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "deal")
public class Deal {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="deal_id_seq")
    @SequenceGenerator(name="deal_id_seq", sequenceName="deal_id_seq", allocationSize=10)
    private Long id;
    private int signed;
    private int value;
    private String currency;
}
