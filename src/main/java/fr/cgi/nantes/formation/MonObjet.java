package fr.cgi.nantes.formation;

public class MonObjet{

    private String attribut1;
    private int valeur;

    public MonObjet(){}

    public MonObjet(String attribut, int valeur){
        this.attribut1 = attribut;
        this.valeur = valeur;
    }

    /**
     * @return the attribut1
     */
    public String getAttribut1() {
        return attribut1;
    }

    /**
     * @param attribut1 the attribut1 to set
     */
    public void setAttribut1(String attribut1) {
        this.attribut1 = attribut1;
    }

    /**
     * @return the valeur
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    
}