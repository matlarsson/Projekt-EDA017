import javax.swing.JTextArea;

public class Console extends JTextArea{
	
	public static String start = "H�r ska text visas beroende p� inmatning.";
	
	public Console(){
		super(start, 5, 30);
		setFont(Fonts.plain);
		setEditable(false);
	}
	
	public void askForName(){
		setText("Skriv in namnet p� varan.");
	}
	
	public void askForDate(){
		setText("Skriv in varans b�st f�re-datum.");
	}
	

}
