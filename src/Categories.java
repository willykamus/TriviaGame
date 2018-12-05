//William Ching
//Java Project
//This enum is to determine the categories inside the game
public enum Categories {

	SPORTS("1.- Sports"), 
	SCIENCE("2.- Science"), 
	GEOGRAPHIC("3.- Geography"),
	STAR_WAS("4.- Star Wars"),
	GoT("5.- Games of Thrones"),
	SUPERHERO("6.- Super Hero powers"),
	EXIT("0.- Exit");

	private String text;
	
	public String getOption() { 
	    return this.text; 
	} 
	
	private Categories(String text) {
		this.text = text;
	}
	
}
