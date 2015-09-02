package vermeg.bourse.tunisie.entity;

public class Cotations {
	
	private String nom ; 
	private String ouverture ;
	private String haut ;
	private String bas;
	private String volume ;
	private String volume2 ;
	public Cotations(String nom, String ouverture, String haut, String bas,
			String volume, String volume2, String dernier, String variation) {
		super();
		this.nom = nom;
		this.ouverture = ouverture;
		this.haut = haut;
		this.bas = bas;
		this.volume = volume;
		this.volume2 = volume2;
		this.dernier = dernier;
		this.variation = variation;
	}
	public String getVolume2() {
		return volume2;
	}
	public void setVolume2(String volume2) {
		this.volume2 = volume2;
	}
	private String dernier ; 
	private String variation ;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getOuverture() {
		return ouverture;
	}
	public void setOuverture(String ouverture) {
		this.ouverture = ouverture;
	}
	public String getHaut() {
		return haut;
	}
	public void setHaut(String haut) {
		this.haut = haut;
	}
	public String getBas() {
		return bas;
	}
	public void setBas(String bas) {
		this.bas = bas;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getDernier() {
		return dernier;
	}
	public void setDernier(String dernier) {
		this.dernier = dernier;
	}
	public String getVariation() {
		return variation;
	}
	public void setVariation(String variation) {
		this.variation = variation;
	}
	public Cotations(String nom, String ouverture, String haut, String bas,
			String volume, String dernier, String variation) {
		super();
		this.nom = nom;
		this.ouverture = ouverture;
		this.haut = haut;
		this.bas = bas;
		this.volume = volume;
		this.dernier = dernier;
		this.variation = variation;
	}
	public Cotations() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
