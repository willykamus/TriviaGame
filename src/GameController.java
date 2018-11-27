import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

	public static Scanner scan = new Scanner(System.in);
	public static final View view = new GameView();
	public static Category category = new Category();
	public static List<Question> questions;
	public static List<Category> categories = new ArrayList<>();
	public static int correctAnswers = 0;
	public static int incorrectAnswers = 0;
	//public static String text;

	private static boolean inputIntegerValid(int answer, int left, int right) {
		
		if(answer >= left && answer <= right) {
			return true;
		}
		return false;
	}
	
	public static Category returnCategory (List<Category> category, String categoryname) {
		
		if(category.size()!=0) {
			for(int i = 0; i < category.size();i++) {
				if(category.get(i).getCategory().equals(categoryname))
					return category.get(i);
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		categories.add(new SportCategory());
		categories.add(new ScienceCategory());

		view.displayMessage("Welcome to the trivia Game, select one of the following options");
		
		int main = -1;
		
		
		
		while(main!=0) {
			
			view.displayMainMenu();
			main = scan.nextInt();
			
			int input = -1;
			
			switch(main) {
			
			case 1:{
				
//				view.displayMessage("Choose a category to play:");
//				view.displayCategoryMenu();
//				input = scan.nextInt();
				
				while(input!=0){
					
					view.displayMessage("Choose a category to play:");
					view.displayCategoryMenu();
					input = scan.nextInt();
					//categories = new ArrayList<>();
						switch(input) {
						case 1:{
							category = returnCategory(categories, "Sports");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;
						}
						break;
						
						case 2:{
							category = returnCategory(categories, "Science");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;

						}
						break;
						
						case 0:{
							view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
							input = scan.nextInt();
							if(input == 0) {
								view.displayResume(categories, correctAnswers, incorrectAnswers);
								//view.displayMessage("Bye, thanks for playing");
								//view.displayMessage("See you in the next run");
								//category = null;
							}else {
								input = -1;
								category = null;
							}
						}
						break;
						}
						
						//Play the chosen category
						if(input!=0 && category!=null) {
							view.displayMessage("This are your questions! Good luck!");
							for(int i = 0; i < questions.size();i++) {
								
								view.displayQuestion(questions.get(i));
								Question question = questions.get(i);
								UserAnswer answer =  view.getUserAnswer();
								while(!inputIntegerValid(answer.getAnswer(),1,4)) {
									view.displayErrorMessage("Answer not Valid, please enter an answer between 1 and 4");
									answer =  view.getUserAnswer();
								}
								boolean correctAnswer = question.checkCorrectAnwer(answer.getAnswer());
								if(correctAnswer) {
									view.displayMessage("Congratulionts, you choose the correct answer");
									category.correcAnswers++;
									correctAnswers++;
								}else {
									view.displayMessage("Wrong Answer");
									view.displayMessage("The correct answer is :"+Integer.toString(question.getCorrectAnswer()));
									category.incorrectAnswers++;
									incorrectAnswers++;
								}
								
							}
							//view.displayMessage("Your results in category: " + category.getCategory());
							view.displayMessage("You get "+ category.correcAnswers + " correct answers and " + 
												category.incorrectAnswers +" incorrect answers");
						}
						
						//category = null;
						//view.displayCategoryMenu();
						//input = scan.nextInt();
					
					
				}// end of while
				
				
				
			}
			break;
			
			case 2:{
				while(input!=0){
				view.displayMessage("Now you are in admin mode.");
				view.displayMessage("Select one of the following options:");
				view.displayAdminMenu();
				int action = scan.nextInt();
				
				if(action!=0) {
					
					view.displayMessage("Select the category you want to edit");
					view.displayCategoryMenu();
					int categoryToChange = scan.nextInt();
					
					switch(categoryToChange) {
					case 1:{
						category = returnCategory(categories, "Sports");
						if(category.questions.isEmpty())
							category.loadQuestions();
						questions = category.questions;
					}
					break;
					
					case 2:{
						category = returnCategory(categories, "Science");
						if(category.questions.isEmpty())
							category.loadQuestions();
						questions = category.questions;
					}
					break;
					}// end of switch of the category the admin wants to change
				}
				
				
				switch(action) {
				case 1:{	// Add a question
					
					Question newQuestion= view.getAnswersFromUser();
					category.questions.add(newQuestion);
					
				}
				break;
				case 2:{
					
				}
				break;
				case 3:{	// delete a question
					
					UserAnswer answer = view.displayAllQuestion(questions);
					category.questions.remove(answer.getAnswer()-1);
					//questions.remove(answer.getAnswer()-1);
					
					
				}
				break;
				case 0:{
					view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
					input = scan.nextInt();
					if(input == 0) {
							view.displayMessage("You exited admin mode");
					}else {
						input = -1;
					}
					
				}
				break;
				}
				}
				
				
			}// end of switch of admin mode
			break;
			
			case 0:{
				view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
				main = scan.nextInt();
				if(main == 0) {
						view.displayMessage("Bye, thanks for playing");
						view.displayMessage("See you in the next run");
				}else {
					main = -1;
				}
			}
			break;
			}// end of main game switch
		}// end of big while
			
	
			
			//view.displayResume(categories, correctAnswers, incorrectAnswers);
			
			scan.close();
		
	}

}
