package com.fitman.aplication.java.service;


import ch.qos.logback.core.joran.conditional.ElseAction;
import com.fitman.aplication.java.model.FitPote;
import com.fitman.aplication.java.model.Utilisateur;
import com.fitman.aplication.java.repository.FitPoteRepository;
import com.fitman.aplication.java.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;
import java.util.Scanner;

public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    private FitPoteRepository fitPoteRepository;

    public void Hollande(Long idUtilisateur, Long idFitPote) throws Exception{

        Long sarko = idUtilisateur;
        Long macron = idFitPote;

        if (sarko != macron){
            fitPoteRepository.save(sarko);
        }
        throw new Exception(sarko, macron) {
                System.out.println("Veuillez changer de FitPote");
            };


    }


}
