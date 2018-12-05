//William Ching
//Java Project
//This enum is to determine the main menu options

public enum MainMenu {

	PLAY ("1. Play"),
	ADMIN ("-. Admin mode (Insert Secret code)"),
	EXIT ("0. Exit the game");
	
	private String text;
	
	public String getOption() { 
        return this.text; 
    } 
	
	private MainMenu(String text) {
		this.text = text;
	}
	
}
