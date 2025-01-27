
public class Athlete extends Person{

	String Category;
	double Time;
	
	public Athlete(String firstName, String lastName, String Category, double Time) {
		super(firstName, lastName);
		this.Category =Category;
		this.Time= Time;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public double getTime() {
		return Time;
	}

	public void setTime(double time) {
		Time = time;
	}
	
}
	
	


