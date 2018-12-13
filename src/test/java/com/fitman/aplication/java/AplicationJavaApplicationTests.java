package com.fitman.aplication.java;

import com.fitman.aplication.java.model.FitPote;
import com.fitman.aplication.java.model.Utilisateur;
import com.fitman.aplication.java.repository.UtilisateurRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AplicationJavaApplicationTests {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Test
	public void testConnexionBdd() {
		//Given

		//When
		Utilisateur u2 = utilisateurRepository.findOne(8L);

		Assert.assertTrue(u2.getNom().equals("Le rebelle"));

		//Then
		// Assert.assertTrue((nbUtilisateur > 0));
	}

}

