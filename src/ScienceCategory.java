
import java.util.ArrayList;

public class ScienceCategory extends Category{

public ScienceCategory() {
		
		category = "Science";
		questions = new ArrayList<>();
	}
	
	@Override
	public void loadQuestions(){
		
		//List<Question> questions = new ArrayList<>();
		
		questions.add(new Question("How long does it take for light from the Sun to reach Earth?", 1, 
				new Answer(1,"8 minutes and 20 seconds"), 
				new Answer(2,"9 minutes and 20 seconds"), 
				new Answer(3,"8 minutes and 40 seconds"), 
				new Answer(4,"9 minutes and 10 seconds")));
		
		questions.add(new Question("Which planet has the most moons?", 2, 
				new Answer(1,"Saturn"), 
				new Answer(2,"Jupiter"), 
				new Answer(3,"Neptune"), 
				new Answer(4,"Venus")));
		
		
		//return questions;
		
	}
	
}
