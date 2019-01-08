import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame  extends JFrame {
	private JFrame frame;
	private TextPanel textPanel;
	private FormPanel formPanel;
	public static String [] wordTypeArray = {"Adjective", "Animal", "Place", "Verb", "Noun", "Verb (Past Tense)",
			"Adverb", "Exclamation", "Friend's Name", "Celebrity", "Silly Word", "Number",
			"Adjective", "Noun (Plural)", "Adjective", "Verb (Past Tense)", "Body Part (Plural)", 
			"Verb", "Noun (Plural)", "Verb (ending in -ing)", "Noun (Plural)", "Noun"};
	
	public MainFrame() {
		super("Create a Halloween story!");
		
		setLayout(new BorderLayout());
		frame = new JFrame();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		
	//	for (int i = 0; i < wordTypeArray.length; i++) {
	//	formPanel.setStringListener(new StringListener() {
//			public void textEmitted(String text) {
//				textPanel.appendText(text);
//			}
//		});
//		}
		
		add(textPanel, BorderLayout.CENTER);
		add(formPanel, BorderLayout.NORTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

