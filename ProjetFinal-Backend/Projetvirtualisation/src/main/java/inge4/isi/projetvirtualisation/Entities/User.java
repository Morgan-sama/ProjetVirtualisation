package inge4.isi.projetvirtualisation.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Table(name = "Utilisateur")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {


    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String nom;

    @Id
    @Column(nullable = false)
    private String email;

    @Column
    private String nom_photo;

    @Column(nullable = false)
    private String sexe;

    @Column(nullable = false)
    private String mdp;


}
