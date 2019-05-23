/*
 * ECM BTB - Equipe ECM - CGI 2015
 * 
 */
package fr.cgi.atc.formation.projetkoavectu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.cgi.atc.formation.projetkoavectu.util.TransformationUtil;

/**
 * ProjetKOAvecTU.java DOCUMENTEZ_MOI
 * 
 * @author viollinn Date: 30 oct. 2015
 */
public class ProjetKOAvecTU {

	private static final Logger LOG = LoggerFactory.getLogger(ProjetKOAvecTU.class);

	/**
	 * 
	 * DOCUMENTEZ_MOI
	 *
	 * @param args
	 */
	public static void main(String args[]) {

		ProjetKOAvecTU simpleTuProject = new ProjetKOAvecTU();
		simpleTuProject.traitement();
	}

	/**
	 * Méthode qui inverse les caractères d'une chaine, filtre les caractères, les transformes en majuscules puis
	 * converti les caractères en ASCII et enfin calcule un MD5
	 *
	 */
	public void traitement() {

		String authorizedChars = "acegikmoqsuwy";
		String chaineATraiter = "abcdewfsghijklmanohpqjrstufbvwxnpyz";

		String chaineFiltree = null;
		String chaineTransformee = null;
		String md5 = null;

		chaineATraiter = TransformationUtil.reverse(chaineATraiter);

		chaineFiltree = TransformationUtil.getAuthorizedCaracters(chaineATraiter, authorizedChars);

		// System.out.println("Attendu: " + StringUtils.reverse("acewsgikmaoqsuwy") + ", reçu: " + chaineFiltree);

		chaineTransformee = TransformationUtil.transformerChaine(chaineFiltree);

		// System.out.println("Attendu: ECA, reçu: " + chaineTransformee);

		md5 = TransformationUtil.getMD5(chaineTransformee);

		LOG.debug("Attendu 3188eeadc0ee2c352e957523739d5d7b, obtenu " + md5);
	}
}
