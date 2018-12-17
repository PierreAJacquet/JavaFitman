package com.fitman.aplication.java.repository;

import com.fitman.aplication.java.model.Utilisateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDate;
import java.util.List;

public interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur, Long> {

    Utilisateur findById (Long id);

    List<Utilisateur> findByNomAndPrenom (String nom, String prenom);

    List<Utilisateur> findByPseudo (String pseudo);

    //List<Utilisateur> findByCodeFitPote (Long codeFitPote);

    List<Utilisateur> findByDateNaissance (LocalDate date);

    List<Utilisateur> findByEmail (String email);

    Page<Utilisateur> findByNom (String nom, Pageable pageable);

    //List<Utilisateur> findByCodeFitPote_Id(Integer id);



}
