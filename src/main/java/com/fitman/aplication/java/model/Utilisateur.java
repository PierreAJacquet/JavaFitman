package com.fitman.aplication.java.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "Id_Utilisateur")
    private Long id;

    @Column(name = "Nom_Utilisateur")
    private String nom;

    @Column(name = "Prenom_Utilisateur")
    private String prenom;

    @Column(name = "Email_Utilisateur")
    private String email;

    @Column(name = "Date_Anniv_Utilisateur")
    private String dateNaissance;

    @Column(name = "Pseudo_Utilisateur")
    private String pseudo;

    @ManyToOne
    @JoinColumn(name = "Code_Fitpote_Utilisateur")
    private FitPote codeFitPote;

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public FitPote getCodeFitPote() {
        return codeFitPote;
    }

    public void setCodeFitPote(FitPote codeFitPote) {
        this.codeFitPote = codeFitPote;
    }

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String email, String dateNaissance, String pseudo, FitPote codeFitPote) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.pseudo = pseudo;
        this.codeFitPote = codeFitPote;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", pseudo='" + pseudo + '\'' +
                ", codeFitPote=" + codeFitPote +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(email, that.email) &&
                Objects.equals(dateNaissance, that.dateNaissance) &&
                Objects.equals(pseudo, that.pseudo) &&
                Objects.equals(codeFitPote, that.codeFitPote);
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, email, dateNaissance, pseudo, codeFitPote);
    }
}
