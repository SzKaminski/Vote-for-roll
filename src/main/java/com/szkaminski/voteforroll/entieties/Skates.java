package com.szkaminski.voteforroll.entieties;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.Year;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Skates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public enum Category {
        SPEED, FITNESS, URBAN, AGGRESSIVE, KIDS
    }

    @NonNull
    private String producer;
    @NonNull
    @Getter
    private String model;

    private Year productionYear;
    private BigDecimal price;
    private int numberOfWheels;
    private String wheels;
    private String shell;
    private String liner;
    private String frame;
    private boolean haveBreak;
    private String bearings;
    private boolean stillOnSale;



}
