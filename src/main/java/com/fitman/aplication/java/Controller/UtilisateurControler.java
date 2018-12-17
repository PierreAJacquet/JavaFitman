package com.fitman.aplication.java.Controller;


import com.fitman.aplication.java.model.Utilisateur;
import com.fitman.aplication.java.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurControler {

    @Autowired
    UtilisateurService utilisateurService;

    @RequestMapping("/changerFitPoteMethode")
    public  Utilisateur changerFitPoteMethode(@RequestParam(value = "idUtilisateur") Long idUtilisateur,
                                                                   @RequestParam(value = "nouveauIdFitPote") Long nouveauIdFitPote) throws Exception {
        return utilisateurService.changerFitPote(idUtilisateur, nouveauIdFitPote);
    }
}
