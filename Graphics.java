
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Graphics implements ActionListener{
	
	private static final String FILENAME = "TextTest";
	private Fridge fridge;
	
	
	private int windowSizeWidth = 1200;
	private int windowSizeHeight = 700;
	
	private InstructionBoard instructionBoard;
	private Console console;
	private Editor editor;
	private Button button;
	
	private JPanel panel;
	
	private GridBagConstraints constraints;
	
	private JFrame frame;
	
//	private String name;
//	private String stringDate;
//	private int date;
	
	private String input;
	private boolean running;
	private boolean pressed;

	
	public Graphics(){

		fridge = new Fridge();
		fridge.readFile(FILENAME);
//		fridge.addItem("Yoghurt", 170608);
		
		instructionBoard = new InstructionBoard();
		console = new Console();
		
		editor = new Editor();
		editor.addActionListener(this);
		
//		button = new Button();
//		button.addActionListener(this);
		
		
		panel = new JPanel(new GridBagLayout());
		constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        running = true;
        input = "0";

	}
	
	public boolean isRunning(){
		return running;
	}
	
	public void runSetup(){
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(instructionBoard, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(console, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(editor, constraints);
        
//        constraints.gridx = 0;
//        constraints.gridy = 3;
//        panel.add(button, constraints);
        
		frame = new JFrame("Kylskåp");
		frame.setVisible(true);
		frame.setSize(windowSizeWidth, windowSizeHeight);
		frame.setLocationRelativeTo(null);
				
		frame.add(panel);
	}
	

	
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource() == button){
			// Läser av texten som skrivs in i editor
			input = editor.getText();
			editor.selectAll();
			pressed = true;
			System.out.println(input);
		} else if(e.getSource() == editor){
			input = editor.getText();
			editor.selectAll();
			System.out.println(input);
			run(Integer.parseInt(input));
		}
		
	}
	
	public String returnInput(){
		return input;
	}
	
	public boolean isEditorEmpty(){
		return editor.getText() == null;
	}
	
	public void run(int nbr){
		
		switch(nbr){
			case 1:
				// Skriv in ny vara
				methodOne();
					
				break;
			case 2:
				// Skriv ut varor i kylskåpet
				console.setText("Hå.");
				break;
			case 3:
				// Ta bort vara
				console.setText("Butts!");
				break;
			default:
				input = editor.getText();
				break;
		}
		
}
	
//	public int firstInput(){
//		String first = editor.getText();
//		return Integer.parseInt(first);
//	}
//	
	
	public void methodOne(){
		
		
		console.setText("Skriv in namn på vara.");
		String name = input;
		
		console.setText("Skriv in varans bäst före-datum.");
		String dateString = input;

		
		int date = Integer.parseInt(dateString);
		
		fridge.addItem(name, date);
	}
	
}
