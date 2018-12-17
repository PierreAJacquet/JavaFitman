package com.fitman.aplication.java.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

@Entity
@Table(name = "fitpote")
public class FitPote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Fitpote")
    private Long id;

    @OneToMany( mappedBy = "fitPote", fetch = FetchType.EAGER)
    @JsonBackReference
    private List<Utilisateur> utilisateur;

    @Column(name = "Nom_Fitpote")
    private String nom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Utilisateur> getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(List<Utilisateur> utilisateur) {
        this.utilisateur = utilisateur;
    }

    public FitPote() {
    }

    public FitPote(List<Utilisateur> utilisateur, String nom) {
        this.utilisateur = utilisateur;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "FitPote{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FitPote fitPote = (FitPote) o;
        return Objects.equals(id, fitPote.id) &&
                Objects.equals(nom, fitPote.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }
}
