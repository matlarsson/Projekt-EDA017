import javax.swing.JTextField;

public class Editor extends JTextField{
	
	public static String typeHere = "Skriv här:";
	
	public Editor(){
		super(30);
		setFont(Fonts.plain);
		setEditable(true);
	}
	
}
