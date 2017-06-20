import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Fridge {
	
	private ArrayList<FoodItem> foodItems;
	
	public Fridge(){
		foodItems = new ArrayList<FoodItem>();
	}
	
	public void addItem(FoodItem foodItem){
		// L‰gger in i listan
		foodItems.add(foodItem);
		
//		// L‰gger in i filen
//		String name = foodItem.getName();
//		int date = foodItem.getDate();
//		
//				try(FileWriter fw = new FileWriter("TextTest", true);
//					    BufferedWriter bw = new BufferedWriter(fw);
//					    PrintWriter out = new PrintWriter(bw))
//					{
//					
//					out.printf("\n%d %s", date, name);
//					    
//					} catch (IOException e) {
//					    //exception handling left as an exercise for the reader
//				}
	}
	
	public void addItem(String name, int date){
		// L‰gger in i listan
		foodItems.add(new FoodItem(name, date));
		
		// L‰gger in i filen
		try(FileWriter fw = new FileWriter("TextTest", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			
			out.printf("\n%d %s", date, name);
			    
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
		}
	}
	
	public ArrayList<FoodItem> getItems(){
		return foodItems;
	}
	
	public void readFile(String string){
		// Filinl√§sning (baserad pÂ Java snabbreferens)
		Scanner scan = null;
		try {
			scan = new Scanner(new File(string));
		} catch (FileNotFoundException e) {
			System.out.println("Filen '" + string + "' kunde inte l√§sas!");
			System.exit(-1);
		}

		System.out.println("L‰ser in anv√§ndardata frÂn " + string + "...");
		while (scan.hasNextLine()) {
			int nbr = scan.nextInt();
			String name = scan.nextLine();
			name = name.trim(); // st‰da bort inledande mellanslag
			FoodItem foodItem = new FoodItem(name, nbr);
			addItem(foodItem);
			
		}
		System.out.println("Klar med inl‰sning av anv‰ndardata.");
	}
	
}
