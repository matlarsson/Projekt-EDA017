import javax.swing.JTextArea;

public class Console extends JTextArea{
	
	public static String start = "Här ska text visas beroende på inmatning.";
	
	public Console(){
		super(start, 5, 30);
		setFont(Fonts.plain);
		setEditable(false);
	}
	
	public void askForName(){
		setText("Skriv in namnet på varan.");
	}
	
	public void askForDate(){
		setText("Skriv in varans bäst före-datum.");
	}
	

}
