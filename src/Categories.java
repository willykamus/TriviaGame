
public enum Categories {

	SPORTS("1.- Sports"), 
	SCIENCE("2.- Science"), 
	GEOGRAPHIC("3.- Geographic"),
	EXIT("0.- Exit");

	private String text;
	
	public String getOption() { 
	    return this.text; 
	} 
	
	private Categories(String text) {
		this.text = text;
	}
	
}
