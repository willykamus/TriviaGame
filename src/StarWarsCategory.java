import java.util.ArrayList;

public class StarWarsCategory extends Category {
	
public StarWarsCategory() {
		
		category = "Star Wars";
		questions = new ArrayList<>();
	}
	
	@Override
	public void loadQuestions(){
		
		//List<Question> questions = new ArrayList<>();
		
		questions.add(new Question("What's Chewbacca's home planet?", 2, 
				new Answer(1,"Bespin"), 
				new Answer(2,"Kashyyyk"), 
				new Answer(3,"Endor"), 
				new Answer(4,"Mustafar")));
		
		questions.add(new Question("Who killed Jango Fett?", 1, 
				new Answer(1,"Mace Windu"), 
				new Answer(2,"Obi-Wan Kenobi"), 
				new Answer(3,"Anakin Skywalker"), 
				new Answer(4,"Boba Fett")));
		
		questions.add(new Question("What game do Chewbacca and R2-D2 play in 'A New Hope'?", 4, 
				new Answer(1,"Jugger"), 
				new Answer(2,"Cheops"), 
				new Answer(3,"Tri-dimensional chess"), 
				new Answer(4,"Dejarik")));
		
		questions.add(new Question("Which of these was not one of Darth Sidious' Sith apprentices?", 4, 
				new Answer(1,"Darth Vader"), 
				new Answer(2,"Darth Tyranus"), 
				new Answer(3,"Darth Maul"), 
				new Answer(4,"General Grievous")));
		
		questions.add(new Question("Who said? I find your lack of faith disturbing.", 2, 
				new Answer(1,"Obi-Wan Kenobi"), 
				new Answer(2,"Darth Vader"), 
				new Answer(3,"The Emperor"), 
				new Answer(4,"Qui-Gon Jinn")));
		
		questions.add(new Question("What was Princess Leia's last name?", 3, 
				new Answer(1,"Fisher"), 
				new Answer(2,"Amidala"), 
				new Answer(3,"Organa"), 
				new Answer(4,"Antilles")));
		
		questions.add(new Question("Who said? It's a trap", 1, 
				new Answer(1,"Admiral Ackbar"), 
				new Answer(2,"Nien Nunb"), 
				new Answer(3,"Boba Fett"), 
				new Answer(4,"Obi-Wan Kenobi")));
		
		questions.add(new Question("What does the 'TIE' in TIE Fighter stand for?", 2, 
				new Answer(1,"Turbo Induction Encabulator"), 
				new Answer(2,"Twin Ion Engine"), 
				new Answer(3,"Techno Incantho Envulcanator"), 
				new Answer(4,"Thermal Inverse Engine")));
		
		questions.add(new Question("What is Count Dooku's Sith name?", 1, 
				new Answer(1,"Darth Tyranus"), 
				new Answer(2,"Darth Rex"), 
				new Answer(3,"Darth Sidious"), 
				new Answer(4,"Darth Maul")));
		
		questions.add(new Question("Who was the first Jedi to learn how to return from death as a Force Ghost?", 4, 
				new Answer(1,"Yoda"), 
				new Answer(2,"Obi-Wan Kenobi"), 
				new Answer(3,"Anakin Skywalker"), 
				new Answer(4,"Qui-Gon Jinn")));
		
		
		
		
		
		//return questions;
		
	}

}
