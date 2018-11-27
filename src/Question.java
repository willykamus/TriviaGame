import java.util.ArrayList;
import java.util.List;

public class Question {

	private String text;
	private int correctAnswer;
	private List<Answer> answers;
	
	public Question() {}
	
	public Question (String question, int correctAnswer, Answer possibleAnswer1, Answer possibleAnswer2, 
						Answer possibleAnswer3, Answer possibleAnswer4) {
		this.text = question;
		this.correctAnswer = correctAnswer;
		this.answers = new ArrayList<>();
		this.answers.add(possibleAnswer1);
		this.answers.add(possibleAnswer2);
		this.answers.add(possibleAnswer3);
		this.answers.add(possibleAnswer4);
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String question) {
		this.text = question;
	}
	
	public List<Answer> getAnswer(){
		return new ArrayList<>(answers);
	}
	
	public void setAnswers(List<Answer> possibleAnswers) {
		this.answers = possibleAnswers;
	}
	
	public int getCorrectAnswer() {
		return this.correctAnswer;
	}
	
	public void setCorrectAnswer(int answer) {
		this.correctAnswer = answer;
	}
	
	public boolean checkCorrectAnwer(int answer) {
		if(correctAnswer == answer) {
			return true;
		}
		return false;
	}
	
}
