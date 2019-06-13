public class TYPE_EOLIENNE {
private String ref_type ;
private Fournisseur fournisseur;
private int puissance;
private float hauteur;
private float vitesse_max;
private int nb_de_pales;
private float tension_deloivree;
private String desc_eolienne ;
private float prix;
private  java.util.Collection<Eolienne> eolienne;

public String getRef_type() {
	return ref_type;
}
public void setRef_type(String ref_type) {
	this.ref_type = ref_type;
}
public Fournisseur getFournisseur() {
	return fournisseur;
}
public void setFournisseur(Fournisseur fournisseur) {
	this.fournisseur = fournisseur;
}
public int getPuissance() {
	return puissance;
}
public void setPuissance(int puissance) {
	this.puissance = puissance;
}
public float getHauteur() {
	return hauteur;
}
public void setHauteur(float hauteur) {
	this.hauteur = hauteur;
}
public float getVitesse_max() {
	return vitesse_max;
}
public void setVitesse_max(float vitesse_max) {
	this.vitesse_max = vitesse_max;
}
public int getNb_de_pales() {
	return nb_de_pales;
}
public void setNb_de_pales(int nb_de_pales) {
	this.nb_de_pales = nb_de_pales;
}
public float getTension_deloivree() {
	return tension_deloivree;
}
public void setTension_deloivree(float tension_deloivree) {
	this.tension_deloivree = tension_deloivree;
}
public String getDesc_eolienne() {
	return desc_eolienne;
}
public void setDesc_eolienne(String desc_eolienne) {
	this.desc_eolienne = desc_eolienne;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public TYPE_EOLIENNE(String ref_type, Fournisseur fournisseur, int puissance, float hauteur, float vitesse_max,
		int nb_de_pales, float tension_deloivree, String desc_eolienne, float prix) {
	
	this.ref_type = ref_type;
	this.fournisseur = fournisseur;
	this.puissance = puissance;
	this.hauteur = hauteur;
	this.vitesse_max = vitesse_max;
	this.nb_de_pales = nb_de_pales;
	this.tension_deloivree = tension_deloivree;
	this.desc_eolienne = desc_eolienne;
	this.prix = prix;
}
public java.util.Collection<Eolienne> getEolienne() {
	return eolienne;
}
public void setEolienne(java.util.Collection<Eolienne> eolienne) {
	this.eolienne = eolienne;
}
}
