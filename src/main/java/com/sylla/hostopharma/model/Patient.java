package com.sylla.hostopharma.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Patient extends AbstractEntity{
    private String nom;
    private String prenom;

    //private Adresse adresse
    @Column
    private String photo ;
    private String mail;
    private String numTel;

}
