import java.util.List;

public class Category {

	public String category;
	public List<Question> questions;
	public int correcAnswers;
	public int incorrectAnswers;
	
	public Category() {
		
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String text) {
		category = text;
	}
	
	public void loadQuestions() {
		
	}
	
	public boolean categoryCreated(List<Category> category, String categoryName) {
		
		for(Category cat : category) {
			if(cat.getCategory().equals(categoryName)) {
				return true;
			}
		}
		return false;	
	}
	
	public Category returnCategory (List<Category> category, String categoryname) {
		
		if(category.size()!=0) {
			for(int i = 0; i < category.size();i++) {
				if(category.get(i).getCategory().equals(categoryname))
					return category.get(i);
			}
		}
		return null;
	}
	
}
