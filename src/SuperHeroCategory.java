import java.util.ArrayList;

public class SuperHeroCategory extends Category {

public SuperHeroCategory() {
		
		category = "SuperHero Powers";
		questions = new ArrayList<>();
	}
	
	@Override
	public void loadQuestions(){
		
		//List<Question> questions = new ArrayList<>();
		
		questions.add(new Question("Wonder Woman", 3, 
				new Answer(1,"Density Control"), 
				new Answer(2,"Space Travel"), 
				new Answer(3,"Super Strength"), 
				new Answer(4,"None")));
		
		questions.add(new Question("Batman", 4, 
				new Answer(1,"Magnetic Field Control"), 
				new Answer(2,"Super Strength"), 
				new Answer(3,"Flying"), 
				new Answer(4,"None")));
		
		questions.add(new Question("SpiderMan", 3, 
				new Answer(1,"Flight"), 
				new Answer(2,"Super Sight"), 
				new Answer(3,"Wall-Crawinling"), 
				new Answer(4,"Invisible")));
		
		questions.add(new Question("Captain America", 1, 
				new Answer(1,"Super Strength"), 
				new Answer(2,"Super Stamina"), 
				new Answer(3,"Weather Manipulation"), 
				new Answer(4,"Inmortality")));
		
		questions.add(new Question("The Incredible Hulk", 3, 
				new Answer(1,"Advanced Healing"), 
				new Answer(2,"Teleportation"), 
				new Answer(3,"Super Strength"), 
				new Answer(4,"Rage")));
		
		questions.add(new Question("IronMan", 4, 
				new Answer(1,"Wall-Crawling"), 
				new Answer(2,"Advanced Healing"), 
				new Answer(3,"Super Strength"), 
				new Answer(4,"Ultra Tech")));
		
		questions.add(new Question("Thor", 1, 
				new Answer(1,"Lighting Manipulation"), 
				new Answer(2,"Super Strength"), 
				new Answer(3,"Telepathy"), 
				new Answer(4,"Flight")));
		
		questions.add(new Question("Wolverine", 2, 
				new Answer(1,"Animal Communication"), 
				new Answer(2,"Advanced Healing"), 
				new Answer(3,"Generate Energy"), 
				new Answer(4,"Adamanthium Claws")));
		
		questions.add(new Question("Quicksilver", 1, 
				new Answer(1,"Super Speed"), 
				new Answer(2,"Metallic Legs"), 
				new Answer(3,"Super Stamina"), 
				new Answer(4,"None")));
		
		questions.add(new Question("Scarlet Witch", 4, 
				new Answer(1,"Super Strength"), 
				new Answer(2,"Metamorphosis"), 
				new Answer(3,"Mind Control"), 
				new Answer(4,"Alter reality")));
		
		
		
		
		
		//return questions;
		
	}
	
}
