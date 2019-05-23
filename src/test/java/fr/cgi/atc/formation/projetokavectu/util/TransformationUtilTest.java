/*
 * ECM BTB - Equipe ECM - CGI 2015
 * 
 */
package fr.cgi.atc.formation.projetokavectu.util;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.cgi.atc.formation.projetokavectu.util.TransformationUtil;

/**
 * TransformationUtilTest.java DOCUMENTEZ_MOI
 * 
 * @author viollinn Date: 30 oct. 2015
 */

public class TransformationUtilTest {

	private static final Logger LOG = LoggerFactory.getLogger(TransformationUtilTest.class);

	@Test
	public void testTransformerChaine() {

		String chaine = null;
		String retour = null;
		String attendu = "65-66-67-68-69-70-71-72-73-74-75-76-77-78-79-80-81-82-83-84-85-86-87-88-89-90";

		// Test cas chaine null
		retour = TransformationUtil.transformerChaine(chaine);
		Assert.assertNull("Le retour devrait être null", retour);

		// test cas passant
		chaine = "abcdefghijklmnopqrstuvwxyz";
		retour = TransformationUtil.transformerChaine(chaine);

		LOG.debug(retour);

		Assert.assertNotNull("Le retour devrait être non null", retour);
		Assert.assertEquals(attendu, retour);

	}

	@Test
	public void testGetMD5() {

		String chaine = null;
		String retour = null;
		String attendu = "c3fcd3d76192e4007dfb496cca67e13b";

		// Test cas chaine null
		retour = TransformationUtil.getMD5(chaine);
		Assert.assertNull("Le retour devrait être null", retour);

		// test cas passant
		chaine = "abcdefghijklmnopqrstuvwxyz";
		retour = TransformationUtil.getMD5(chaine);

		LOG.debug(retour);

		Assert.assertNotNull("Le retour devrait être non null", retour);
		Assert.assertEquals(attendu, retour);
	}

	@Test
	public void testGetAuthorizedCaracters() {

		String chaine = null;
		String retour = null;
		String authorizedChars = null;
		String attendu = "c3fcd3d76192e4007dfb496cca67e13b";

		// Test cas chaine null et authorizedChars non null
		retour = TransformationUtil.getAuthorizedCaracters(chaine, authorizedChars);
		Assert.assertNull("Le retour devrait être null", retour);

		// Test cas chaine non null et authorizedChars null
		chaine = "abcdefghijklmnopqrstuvwxyz";
		attendu = "abcdefghijklmnopqrstuvwxyz";
		retour = TransformationUtil.getAuthorizedCaracters(chaine, authorizedChars);
		Assert.assertNotNull("Le retour devrait être non null", retour);
		Assert.assertEquals(attendu, retour);

		// Test cas chaine ne contient pas de caractères dans authorizedChars
		chaine = "ghijklm";
		attendu = chaine;
		retour = TransformationUtil.getAuthorizedCaracters(chaine, authorizedChars);
		Assert.assertNotNull("Le retour devrait être non null", retour);
		Assert.assertEquals(attendu, retour);

		// test cas passant
		chaine = "abcdefghijklmnopqrstuvwxyz";
		authorizedChars = "abcdef";
		attendu = "abcdef";
		retour = TransformationUtil.getAuthorizedCaracters(chaine, authorizedChars);
		Assert.assertNotNull("Le retour devrait être non null", retour);
		Assert.assertEquals(attendu, retour);
	}
}
