package com.fitman.aplication.java.service;


import com.fitman.aplication.java.model.FitPote;
import com.fitman.aplication.java.model.Utilisateur;
import com.fitman.aplication.java.repository.FitPoteRepository;
import com.fitman.aplication.java.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private FitPoteRepository fitPoteRepository;

    public Utilisateur changerFitPote(Long idUtilisateur, Long nouveauIdFitPote) throws Exception {

        Utilisateur u2 = utilisateurRepository.findById(idUtilisateur);
        if (u2 == null) {
            throw new Exception("L'utilisateur n'existe pas");
        }

        //On est sur que le fitpote n'est pas null
        Long idAncienFitPote = u2.getFitPote().getId();

        if (idAncienFitPote.equals(nouveauIdFitPote)) {
            throw new Exception("Veuillez changer de FitPote");
        }

        FitPote fitPoteOld = u2.getFitPote();//fitPoteRepository.findById(idAncienFitPote);
        FitPote fitPoteNew = fitPoteRepository.findById(nouveauIdFitPote);

        if (fitPoteNew == null) {
            throw new Exception("Le FitPote n'est pas correct");
        }

        //MAJ ton user en changeant son Fitpote
        u2.setFitPote(fitPoteNew);

        //Sauvegarde de l'utilisateur en BDD
        return utilisateurRepository.save(u2);


    }
}
