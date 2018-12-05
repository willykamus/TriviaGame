// William Ching
// Java Project
// This class controls the game


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

		//Create an object of each category and added to the list of categories
		categories.add(new SportCategory());
		categories.add(new ScienceCategory());
		categories.add(new GeographyCategory());
		categories.add(new StarWarsCategory());
		categories.add(new GoTCategory());
		categories.add(new SuperHeroCategory());

		view.displayMessage("Welcome to the trivia Game, select one of the following options");
		
		int main = -1;
		
		//A while to keep the user inside the game
		while(main!=0) {
			
			view.displayMainMenu();
			main = view.getIntFromUser();
			
			int input = -1;
			
			//This switch is for the main menu
			switch(main) {
			
			//The user will play the game
			case 1:{
				
				//This while will keep the user playing trivia.
				while(input!=0){
					
					view.displayMessage("Choose a category to play:");
					view.displayCategoryMenu();
					input = view.getIntFromUser();
					//input = intScan.nextInt();
					//categories = new ArrayList<>();
					//With this switch, first I search for the category and check if the questions for that
					//category are inside the object. If not load them inside the objects, and inside question list
						switch(input) {
						case 1:{
							category = returnCategory(categories, "Sports");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;
							category.correcAnswers = 0;
							category.incorrectAnswers = 0;
						}
						break;
						
						case 2:{
							category = returnCategory(categories, "Science");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;
							category.correcAnswers = 0;
							category.incorrectAnswers = 0;

						}
						break;
						
						case 3:{
							category = returnCategory(categories, "Geography");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;
							category.correcAnswers = 0;
							category.incorrectAnswers = 0;

						}
						break;
						
						case 4:{
							category = returnCategory(categories, "Star Wars");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;
							category.correcAnswers = 0;
							category.incorrectAnswers = 0;

						}
						break;
						
						case 5:{
							category = returnCategory(categories, "GoT");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;
							category.correcAnswers = 0;
							category.incorrectAnswers = 0;

						}
						break;
						
						case 6:{
							category = returnCategory(categories, "SuperHero Powers");
							if(category.questions.isEmpty())
								category.loadQuestions();
							questions = category.questions;
							category.correcAnswers = 0;
							category.incorrectAnswers = 0;

						}
						break;
						
						case 0:{
							view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
							input = view.getIntFromUser();
							if(input == 0) {
								//If the user decide to quit, this show the whole result.
								view.displayResume(categories, correctAnswers, incorrectAnswers);
								//view.displayMessage("Bye, thanks for playing");
								//view.displayMessage("See you in the next run");
								//category = null;
							}else {
								input = -1;
								//This set the category to null so the following step is not going to be executed.
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
					
				}// end of while for playing the game

			}
			break;
			
			// Admin mode
			case 1233:{
				while(input!=0){
				view.displayMessage("Now you are in admin mode.");
				view.displayMessage("Select one of the following options:");
				view.displayAdminMenu();
				// get the user first input... 
				int action = view.getIntFromUser();
				
				if(action!=0) {
					
					view.displayMessage("Select the category you want to edit");
					view.displayCategoryMenu();
					int categoryToChange = view.getIntFromUser();
					
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
					
					case 6:{
						category = returnCategory(categories, "SuperHero Powers");
						if(category.questions.isEmpty())
							category.loadQuestions();
						questions = category.questions;

					}
					break;
					
					case 0:{
						view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
						input = view.getIntFromUser();
						if(input == 0) {
								view.displayMessage("You exited");
								action = 0;
								input = -1;
						}else {
							
							//input = -1;
						}
					}
					}// end of switch of the category the admin wants to change
				}else {
					view.displayMessage("Are you sure you want to quit? enter Enter 0 to confirm, or other value to continue.");
					input = view.getIntFromUser();
					if(input == 0) {
							view.displayMessage("You exited admin Mode");
							action = 0;
					}else {
						//input = -1;
						
					}
				}
				
				if(action!=0) {
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
						int adminOption = view.getIntFromUser();
						
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
								input = view.getIntFromUser();
								if(input == 0) {
										view.displayMessage("You exited");
								}else {
									//input = -1; // check this 
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
						input = view.getIntFromUser();
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
				main = view.getIntFromUser();
				if(main == 0) {
						view.displayMessage("Bye, thanks for playing");
						view.displayMessage("See you in the next run");
				}else {
					main = -1;
				}
			}
			break;
			default:{
				view.displayErrorMessage("Option not available");
			}
			break;
			}// end of main game switch
		}// end of big while
		
		//view.closeScanner();
		intScan.close();
		view.closeScanner();
		
	}

}
