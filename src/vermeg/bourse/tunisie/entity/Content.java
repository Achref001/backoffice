package vermeg.bourse.tunisie.entity;

public class Content {
	private String tag ;
	private String value ;
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Content(String tag, String value) {
		super();
		this.tag = tag;
		this.value = value;
	}
	public Content() {
		super();
		// TODO Auto-generated constructor stub
	} 
	

}
