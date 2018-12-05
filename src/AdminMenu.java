//William Ching
//Java Project
//This enum is to determine the admin menu options
public enum AdminMenu {

	OPTION1 ("1. Add a question"),
	OPTION2 ("2. Modify a question or answer"),
	OPTION3 ("3. Delete a question"),
	OPTION4 ("0. Exit admin mode");
	
	private String text;
	
	public String getOption() { 
        return this.text; 
    } 
	
	private AdminMenu(String text) {
		this.text = text;
	}
	
}
