import javax.swing.JTextArea;

public class InstructionBoard extends JTextArea{
	
	private static String instructions = "1. Skriv in ny vara. \n2. Vad finns i kylskåpet? \n3. Ta bort vara.";
	private JTextArea instructionBoard;
	
	
	public InstructionBoard(){
		super(instructions, 3, 30);
		setFont(Fonts.bold);
		setEditable(false);
	}
	
	
	
	
}
