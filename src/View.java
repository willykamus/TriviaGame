import java.util.List;

public interface View {

	public void displayQuestion(Question question);
	
	public void displayAnswer(Answer answer);
	
	public UserAnswer getUserAnswer();
	
	public void displayErrorMessage(String text);
	
	public void displayQuestionMenu();
	
	public void displayMainMenu();
	
	public void displayAdminMenu();
	
	public void displayCategoryMenu();
	
	public void displayMessage(String text);
	
	public void displayResume(List<Category> categories, int corrects, int wrongs);
	
	public String getStringFromUser();
	
	public Question addQuestion();
	
	public UserAnswer displayAllQuestion(List<Question> questions);
	
	public void closeScanner();
	
}
