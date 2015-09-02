package vermeg.bourse.tunisie.entity;

public class Palmeras {
	private String nom ; 
	private String haut ;
	private String bas ; 
	private String dernier ; 
	private String volume; 
	private String variationdujour ;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public String getDernier() {
		return dernier;
	}
	public void setDernier(String dernier) {
		this.dernier = dernier;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getVariationdujour() {
		return variationdujour;
	}
	public void setVariationdujour(String variationdujour) {
		this.variationdujour = variationdujour;
	}
	public Palmeras(String nom, String haut, String bas, String dernier,
			String volume, String variationdujour) {
		super();
		this.nom = nom;
		this.haut = haut;
		this.bas = bas;
		this.dernier = dernier;
		this.volume = volume;
		this.variationdujour = variationdujour;
	}
	public Palmeras() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
