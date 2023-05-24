package com.gestion.gestionMateriel.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Utilisateur {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String email;

    public Utilisateur() {
        super();
    }

    public Utilisateur(String nom, String prenom, int age, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}
