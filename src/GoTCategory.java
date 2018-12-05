import java.util.ArrayList;

public class GoTCategory extends Category {
	
public GoTCategory() {
		
		category = "GoT";
		questions = new ArrayList<>();
	}
	
	@Override
	public void loadQuestions(){
		
		//List<Question> questions = new ArrayList<>();
		
		questions.add(new Question("What are the first words spoken in the first episode of 'Game of Thrones'?", 4, 
				new Answer(1,"Noooooo!"), 
				new Answer(2,"We should head back to the Wall"), 
				new Answer(3,"You want to run away south, run away"), 
				new Answer(4,"What do you expect? they are savages")));
		
		questions.add(new Question("Who said it: I never loved my brothers.", 1, 
				new Answer(1,"Robert Baratheon"), 
				new Answer(2,"Cersei Lannister"), 
				new Answer(3,"Viserys Targaryen"), 
				new Answer(4,"Theon Greyjoy")));
		
		questions.add(new Question("What are 'quiet as shadows and light as feathers?'", 2, 
				new Answer(1,"Faceless Men"), 
				new Answer(2,"Cats"), 
				new Answer(3,"The best Swordsmen"), 
				new Answer(4,"The kingsguard")));
		
		questions.add(new Question("What was the poison that killed John Arryn?", 2, 
				new Answer(1,"Demon's Dance"), 
				new Answer(2,"Tears of Lys"), 
				new Answer(3,"The Long Farewell"), 
				new Answer(4,"Nightshade")));
		
		questions.add(new Question("Who encourages Ned Stark to take the Throne himself, kill Stannis, and kill Joffrey if he becomes a problem?", 3, 
				new Answer(1,"Robert Baratheon"), 
				new Answer(2,"Renly Baratheon"), 
				new Answer(3,"Petyr Baelish"), 
				new Answer(4,"Lord Varys")));
		
		questions.add(new Question("What was the poison that killed John Arryn?", 2, 
				new Answer(1,"Demon's Dance"), 
				new Answer(2,"Tears of Lys"), 
				new Answer(3,"The Long Farewell"), 
				new Answer(4,"Nightshade")));
		
		questions.add(new Question("What's the name of the ship Theon takes to Winterfell?", 4, 
				new Answer(1,"Kraken Whore"), 
				new Answer(2,"The orphan"), 
				new Answer(3,"Iron queen"), 
				new Answer(4,"Sea bitch")));
		
		questions.add(new Question("Who is commissioned to create wildfire for Cersei?", 2, 
				new Answer(1,"The Kingsguard"), 
				new Answer(2,"The Alchemists guild"), 
				new Answer(3,"The Pyromancers commission"), 
				new Answer(4,"The Wizards guild")));
		
		questions.add(new Question("Who actually steals Daenerys' dragons?", 1, 
				new Answer(1,"Xaro Xhoan Daxos"), 
				new Answer(2,"Irri"), 
				new Answer(3,"Nathalia"), 
				new Answer(4,"Pyat Pree")));
		
		questions.add(new Question("Who is Davos' son?", 4, 
				new Answer(1,"Steffon"), 
				new Answer(2,"Thomath"), 
				new Answer(3,"Ormund"), 
				new Answer(4,"Matthos")));
		
		
		
		
	}

}
