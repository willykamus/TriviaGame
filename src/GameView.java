import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameView implements View {

	public static Scanner intScan = new Scanner(System.in);
	public static Scanner strScan = new Scanner(System.in);
	
	public void displayQuestion(Question question) {
		
		System.out.println(question.getText());
		for(Answer answer: question.getAnswer()) {
			displayAnswer(answer);
		}	
	}
	
	public void displayAnswer(Answer answer) {
		
		StringBuffer print = new StringBuffer();
		print.append(answer.getAnswerPosition());
		print.append(".- ");
		print.append(answer.getText());
		System.out.println(print.toString());
		
	}
	
	public int getAnswerFromUserInput(int userInput) {
		try {
			return userInput;
		}catch(Exception e) {
			System.out.println("Invalid Input");
			return 0;
		}
	}
	
	public UserAnswer getUserAnswer() {
		int input = intScan.nextInt();
		int answer = getAnswerFromUserInput(input);
		return new UserAnswer(answer);
	}
	
	public void closeScanner() {
		intScan.close();
		strScan.close();
	}
	
	public void displayErrorMessage(String text) {
		System.out.println(text);
	}

	public void displayMessage(String text) {
		System.out.println(text);
	} 
	
	public void displayMainMenu() {
		
		List<MainMenu> menu = Arrays.asList(MainMenu.values());
		for(int i = 0; i< menu.size();i++) {
			System.out.println(menu.get(i).getOption());
		}
	}
	
	public void displayQuestionMenu() {
		
		List<EditQuestionMenu> menu = Arrays.asList(EditQuestionMenu.values());
		for(int i = 0; i< menu.size();i++) {
			System.out.println(menu.get(i).getOption());
		}
		
	}
	
	public void displayAdminMenu() {
		
		List<AdminMenu> menu = Arrays.asList(AdminMenu.values());
		for(int i = 0; i< menu.size();i++) {
			System.out.println(menu.get(i).getOption());
		}
	}
	
	public void displayCategoryMenu() {
		
		List<Categories> categories = Arrays.asList(Categories.values());
		for(int i = 0; i<categories.size();i++) {
			System.out.println(categories.get(i).getOption());
		}
		
	}
	
	public void displayResume(List<Category> categories, int correct, int wrongs) {
		
		for(Category category : categories) {
			if(category.correcAnswers == 0 && category.incorrectAnswers == 0) {
				
			}else {
				System.out.println("Your result in category: " + category.category);
				System.out.println("You got " + category.correcAnswers + " correct and " + category.incorrectAnswers + " wrong answers");
			}
			
		}
		
		System.out.println("Your performance was: " + correct + " corrects of "+ (correct+wrongs)+" questions for a " + 
							((correct)/(float)(correct + wrongs))*100 + "%");
	}
	
	public String getStringFromUser() {
		
		String inputUser = strScan.nextLine();
		return inputUser;
		
	}

	public Question addQuestion() {
		
		
		List<Answer> answers = new ArrayList<>();
		
		displayMessage("Insert the question:");
		String questionText = getStringFromUser();

		for(int i = 1; i <= 4; i++) {
			
			displayMessage("Insert possible answer number "+ i);
			String text = getStringFromUser();
			Answer possible = new Answer();
			possible.setText(text);
			possible.setAnswerPosition(i);
			answers.add(possible);
			
		}
		
		displayMessage("Insert the number of the correct answer from 1 to 4:");
		UserAnswer correctNewQuestion = getUserAnswer();
		
		Question newQuestion = new Question();
		newQuestion.setText(questionText);
		newQuestion.setAnswers(answers);
		newQuestion.setCorrectAnswer(correctNewQuestion.getAnswer());
		
		return newQuestion;
	}
	
	public UserAnswer displayAllQuestion(List<Question> questions){
		
		int i = 1;
		for(Question question : questions) {
			displayMessage(i + ".- " + question.getText());
			i++;
		}
		int num = intScan.nextInt();
		UserAnswer answer = new UserAnswer(num);
		
		return answer;
		
	}
	
}
