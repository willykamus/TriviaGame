
import java.util.ArrayList;

public class SportCategory extends Category{

public SportCategory() {
		
		category = "Sports";
		questions = new ArrayList<>();
	}
	
	@Override
	public void loadQuestions(){
		
		
		
		questions.add(new Question("Who was the last Formula one champion with Ferrari??", 1, 
				new Answer(1,"Kimi Raikkonen"), 
				new Answer(2,"Fernando Alonso"), 
				new Answer(3,"Michael Schumacher"), 
				new Answer(4,"Felipe Massa")));
		
		questions.add(new Question("What male tennis player has won the most Grand Slam titles?", 2, 
				new Answer(1,"Rafael Nadal"), 
				new Answer(2,"Roger Federer"), 
				new Answer(3,"Bjorn Borg"), 
				new Answer(4,"Pete Sampras")));
		
		questions.add(new Question("What is the highest score possible in 10 pin bowling?", 4, 
				new Answer(1,"270"), 
				new Answer(2,"280"), 
				new Answer(3,"290"), 
				new Answer(4,"300")));
		
		//return questions;
		
	}
	
}
