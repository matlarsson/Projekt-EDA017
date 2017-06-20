
public class FoodItem {
	private String name;
	private int date;
	
	
	public FoodItem(String name, int date){
		this.name = name;
		this.date = date;
	}
	
	public String getName(){
		return name;
	}
	
	public int getDate(){
		return date;
	}
	
	public String toString(){
		return name + ", bäst före: " + date;
	}
}
