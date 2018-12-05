
public enum Categories {

	SPORTS("1.- Sports"), 
	SCIENCE("2.- Science"), 
	GEOGRAPHIC("3.- Geography"),
	STAR_WAS("4.- Star Wars"),
	GoT("5.- Games of Thrones"),
	EXIT("0.- Exit");

	private String text;
	
	public String getOption() { 
	    return this.text; 
	} 
	
	private Categories(String text) {
		this.text = text;
	}
	
}
