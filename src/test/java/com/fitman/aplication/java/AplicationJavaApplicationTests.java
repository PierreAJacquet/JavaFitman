package com.fitman.aplication.java;

import com.fitman.aplication.java.model.Utilisateur;
import com.fitman.aplication.java.repository.UtilisateurRepository;
import com.fitman.aplication.java.service.UtilisateurService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AplicationJavaApplicationTests {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	private UtilisateurService utilisateurService;

	@Test
	public void testConnexionBdd() {
		//Given

		//When
		Utilisateur u5 = utilisateurRepository.findOne(8L);

		Assert.assertTrue(u5.getNom().equals("Le rebelle"));

		//Then
		// Assert.assertTrue((nbUtilisateur > 0));
	}

	@Test
	public void contextLoads(){

	}

	/*
	@Test
	public void changementFitPoteNonPassant(){
		//Given
		Long nouveauIdFitPote = 2L;
		Long idAncienFitPote = 2L;

		//When

		Boolean ChangOK = utilisateurService.changerFitPote(nouveauIdFitPote);

		//Then
		Assert.assertTrue(ChangOK);
	} */
}

