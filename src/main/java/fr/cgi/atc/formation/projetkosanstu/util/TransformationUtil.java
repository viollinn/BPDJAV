/*
 * ECM BTB - Equipe ECM - CGI 2015
 * 
 */
package fr.cgi.atc.formation.projetkosanstu.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TransformationUtil.java DOCUMENTEZ_MOI
 * 
 * @author viollinn Date: 30 oct. 2015
 */
public final class TransformationUtil {

	private static final Logger LOG = LoggerFactory.getLogger(TransformationUtil.class);

	private TransformationUtil() {
	}

	/**
	 * Inverse les caractères d'une chaine DOCUMENTEZ_MOI
	 *
	 * @param chaine
	 * @return
	 */
	public static final String reverse(String chaine) {

		String reverted = null;

		if (chaine != null) {

			for (int i = 0; i < chaine.length(); i++) {

				reverted = chaine.charAt(i) + reverted;

			}
		}

		return reverted;
	}

	/**
	 * Calcul le MD5 d'une chaine
	 *
	 * @param chaine
	 * @return null si chaine est null
	 */
	public static String getMD5(String chaine) {

		String retour = null;

		if (chaine != null) {
			byte[] uniqueKey = chaine.getBytes();
			byte[] hash;

			try {
				hash = MessageDigest.getInstance("MD5").digest(uniqueKey);
				StringBuilder hashString = new StringBuilder();
				for (int i = 0; i < hash.length; i++) {
					String hex = Integer.toHexString(hash[i]);
					if (hex.length() == 1) {
						hashString.append('0');
						hashString.append(hex.charAt(hex.length() - 1));
					} else
						hashString.append(hex.substring(hex.length() - 2));
				}

				retour = hashString.toString();

			} catch (NoSuchAlgorithmException e) {

				LOG.error(e.getLocalizedMessage(), e);
			}
		}

		return retour;
	}

	/**
	 * Transforme une chaine de caractère en chaine contenant les équivalent ASCII séparés par un tiret
	 *
	 * @param chaine
	 * @return null si chaine est null
	 */
	public static String transformerChaine(String chaine) {

		String retour = null;

		if (chaine != null) {

			StringBuffer sb = new StringBuffer();
			char[] caracteres = chaine.toCharArray();
			char caractere;

			for (int i = 0; i < caracteres.length; i++) {

				caractere = caracteres[i];

				caractere = minToMaj(caractere);

				sb.append((int) caracteres[i]);
				if (i + 1 < caracteres.length) {
					sb.append("-");
				}
				i++;
			}

			retour = sb.toString();
		}

		return retour;
	}

	/**
	 * Transforme un caractère en majuscule
	 *
	 * @param car
	 * @return
	 */
	private static final char minToMaj(char car) {

		int carValue = (int) car;

		return (char) (carValue - 32);
	}

	/**
	 * 
	 * Filtre les caractères authorisés d'une chaine
	 *
	 * @param chaine
	 * @param authorizedChars
	 * @return null si chaine est null, chaine si authorizedChars est null
	 */
	public static final String getAuthorizedCaracters(String chaine, String authorizedChars) {

		String retour = null;

		if ((chaine != null)) {

			retour = chaine;

			if (authorizedChars != null) {

				StringBuffer sb = new StringBuffer();

				for (int i = 0; i < chaine.length(); i = i + 1) {

					for (int j = 0; j < authorizedChars.length(); j++) {

						if (chaine.charAt(j) == authorizedChars.charAt(j)) {

							sb.append(chaine.charAt(i++));
						}

					}
				}

				retour = sb.toString();
			}
		}

		return retour;
	}
}
