import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

	public static Scanner intScan = new Scanner(System.in);
	public static final View view = new GameView();
	public static Category category = new Category();
	public static List<Question> questions;
	public static List<Category> categories = new ArrayList<>();
	public static int correctAnswers = 0;
	public static int incorrectAnswers = 0;

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
		categories.add(new GeographyCategory());
		categories.add(new StarWarsCategory());
		categories.add(new GoTCategory());

		view.displayMessage("Welcome to the trivia Game, select one of the following options");
		
		int main = -1;
		
		while(main!=0) {
			
			view.displayMainMenu();
			main = intScan.nextInt();
			
			int input = -1;
			
			switch(main) {
			
			case 1:{
				
				while(input!=0){
					
					view.displayMessage("Choose a category to play:");
					view.displayCategoryMenu();
					input = intScan.nextInt();
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
						
						case 3:{
							category = returnCategory(categories, "Geography");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;

						}
						break;
						
						case 4:{
							category = returnCategory(categories, "Star Wars");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;

						}
						break;
						
						case 5:{
							category = returnCategory(categories, "GoT");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;

						}
						break;
						
						case 0:{
							view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
							input = intScan.nextInt();
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
							
							view.displayMessage("You get "+ category.correcAnswers + " correct answers and " + 
												category.incorrectAnswers +" incorrect answers");
						}
					
				}// end of while

			}
			break;
			
			case 2:{
				while(input!=0){
				view.displayMessage("Now you are in admin mode.");
				view.displayMessage("Select one of the following options:");
				view.displayAdminMenu();
				int action = intScan.nextInt();
				
				if(action!=0) {
					
					view.displayMessage("Select the category you want to edit");
					view.displayCategoryMenu();
					int categoryToChange = intScan.nextInt();
					
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
					
					case 3:{
						category = returnCategory(categories, "Geography");
						if(category.questions.isEmpty())
							category.loadQuestions();
						questions = category.questions;

					}
					break;
					
					case 4:{
						category = returnCategory(categories, "Star Wars");
						if(category.questions.isEmpty())
							category.loadQuestions();
						questions = category.questions;

					}
					break;
					
					case 5:{
						category = returnCategory(categories, "GoT");
						if(category.questions.isEmpty())
							category.loadQuestions();
						questions = category.questions;

					}
					break;
					
					case 0:{
						view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
						input = intScan.nextInt();
						if(input == 0) {
								view.displayMessage("You exited");
						}else {
							input = -1;
						}
					}
					}// end of switch of the category the admin wants to change
				}
				
				if(input!=0) {
					switch(action) {
					case 1:{	// Add a question
						
						Question newQuestion= view.addQuestion();
						category.questions.add(newQuestion);
						
					}
					break;
					case 2:{
						
						UserAnswer answer = view.displayAllQuestion(questions);
						Question questionEdit = category.questions.get(answer.getAnswer()-1);
						view.displayMessage("Select one of the following options:");
						view.displayQuestionMenu();
						int adminOption = intScan.nextInt();
						
						switch(adminOption) {
						
							case 1:{
								view.displayMessage("Insert the new text for that option");
								String text = view.getStringFromUser();
								questionEdit.setText(text);
							}
							break;
							case 2:{
								
								view.displayMessage("Select the answer you want to edit");
								answer = view.getUserAnswer();
								view.displayMessage("Insert the new text for that option");
								String text = view.getStringFromUser();
								questionEdit.getAnswer().get(answer.getAnswer()-1).setText(text);
								
							}
							break;
							case 3:{
								view.displayMessage("Select the new correct answer from 1 to 4");
								answer = view.getUserAnswer();
								while(inputIntegerValid(answer.getAnswer(),1,4)) {
									view.displayErrorMessage("Invalid input");
									answer = view.getUserAnswer();
								}
								questionEdit.setCorrectAnswer(answer.getAnswer());
								
							}
							break;
							
							case 0:{
								view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
								input = intScan.nextInt();
								if(input == 0) {
										view.displayMessage("You exited");
								}else {
									input = -1;
								}
								
							}
							break;
	
						}// end switch
						
					}
					break;
					case 3:{	// delete a question
						
						UserAnswer answer = view.displayAllQuestion(questions);
						category.questions.remove(answer.getAnswer()-1);

					}
					break;
					case 0:{
						view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
						input = intScan.nextInt();
						if(input == 0) {
								view.displayMessage("You exited admin mode");
						}else {
							input = -1;
						}
						
					}
					break;
					}

				}

				}// end of while in admin mode
				
			}// end of switch of admin mode
			break;
			
			case 0:{
				view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
				main = intScan.nextInt();
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
		
		//view.closeScanner();
		intScan.close();
		view.closeScanner();
		
	}

}
