	package vermeg.bourse.tunisie.entity;

public class Content {
	private String tag ;
	private String value ;
	private int id ;
	private String url;
	
	public Content(String tag, String value, int id, String url) {
		super();
		this.tag = tag;
		this.value = value;
		this.id = id;
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Content(String tag, String value , int id) {
		super();
		this.tag = tag;
		this.value = value;
		this.id= id ;
	}
	public Content() {
		super();
		// TODO Auto-generated constructor stub
	} 
	

}
