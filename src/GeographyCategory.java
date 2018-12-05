import java.util.ArrayList;

public class GeographyCategory extends Category {

public GeographyCategory() {
		
		category = "Geography";
		questions = new ArrayList<>();
	}
	
	@Override
	public void loadQuestions(){
		
		//List<Question> questions = new ArrayList<>();
		
		questions.add(new Question("What is the approximate size of Earth'2 equator?", 4, 
				new Answer(1,"30.000 km"), 
				new Answer(2,"20.000 km"), 
				new Answer(3,"50.000 km"), 
				new Answer(4,"40.000 km")));
		
		questions.add(new Question("Which is the world's highest mountain?", 2, 
				new Answer(1,"Makalu"), 
				new Answer(2,"Everest"), 
				new Answer(3,"Kilimanjaro"), 
				new Answer(4,"K2")));
		
		questions.add(new Question("Which of these cities is not in Europe ?", 2, 
				new Answer(1,"Moscow"), 
				new Answer(2,"Barcelona"), 
				new Answer(3,"Prague"), 
				new Answer(4,"Keykjavik")));
		
		
		//return questions;
		
	}
	
}
