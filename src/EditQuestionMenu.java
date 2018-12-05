//William Ching
//Java Project
//This enum is to determine the options to edit the questions

public enum EditQuestionMenu {

	OPTION1 ("1. Set question text"),
	OPTION2 ("2. Set answer text"),
	//OPTION3 ("3. Set question text and answers text"),
	OPTION3 ("3. Set a new correct answer"),
	OPTION4 ("0. Exit");
	
	private String text;
	
	public String getOption() { 
        return this.text; 
    } 
	
	private EditQuestionMenu(String text) {
		this.text = text;
	}
	
}
