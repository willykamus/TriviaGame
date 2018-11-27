
public enum MainMenu {

	PLAY ("1. Play"),
	ADMIN ("2. Admin mode"),
	EXIT ("0. Exit the game");
	
	private String text;
	
	public String getOption() { 
        return this.text; 
    } 
	
	private MainMenu(String text) {
		this.text = text;
	}
	
}
