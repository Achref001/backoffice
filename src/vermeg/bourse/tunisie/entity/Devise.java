package vermeg.bourse.tunisie.entity;

public class Devise {
	private String country ;
	private String code ;
	private String unity;
	private String Achat;
	private String vente ;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUnity() {
		return unity;
	}
	public void setUnity(String unity) {
		this.unity = unity;
	}
	public String getAchat() {
		return Achat;
	}
	public void setAchat(String achat) {
		Achat = achat;
	}
	public String getVente() {
		return vente;
	}
	public void setVente(String vente) {
		this.vente = vente;
	}
	public Devise(String country, String code, String unity, String achat,
			String vente) {
		super();
		this.country = country;
		this.code = code;
		this.unity = unity;
		Achat = achat;
		this.vente = vente;
	}
	public Devise() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
