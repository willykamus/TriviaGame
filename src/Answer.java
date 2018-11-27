
public class Answer {

	private String text;
	private int option;
	
	public Answer(){}
	
	public Answer(int option, String string) {
		this.option = option;
		text = string;
	}
	
	public int getAnswerPosition() {
		return option;
	}
	
	public void setAnswerPosition(int answer) {
		option = answer;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String question) {
		text = question;
	}
	
}
