/**
 * 
 */
package beans;

/**
 * @author timmy modèle
 */
public class Client {

    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String mail;

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }

    public void setAdresse( String adresse ) {
        this.adresse = adresse;
    }

    /**
     * @param tel
     *            the tel to set
     */
    public void setTel( String tel ) {
        this.tel = tel;
    }

    /**
     * @param mail
     *            the mail to set
     */
    public void setMail( String mail ) {
        this.mail = mail;
    }
}
