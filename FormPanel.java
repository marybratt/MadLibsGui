import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel textLabel;
	private JTextField textField;
	
	public static String [] wordTypeArray = {"Adjective", "Animal", "Place", "Verb", "Noun", "Verb (Past Tense)",
			"Adverb", "Exclamation", "Friend's Name", "Celebrity", "Silly Word", "Number",
			"Adjective", "Noun (Plural)", "Adjective", "Verb (Past Tense)", "Body Part (Plural)", 
			"Verb", "Noun (Plural)", "Verb (ending in -ing)", "Noun (Plural)", "Noun"};
		public static String [] wordArray = new String[22];
		int arrIndex = 0;
	
	public  FormPanel() {
		textLabel = new JLabel();
		//textLabel.setBounds(5, 5, 100, 20);
		textField = new JTextField(10);
	//	textLabel.setBounds(5, 105, 50, 20);
		textLabel.setFont(new Font("Arial Bold", Font.PLAIN, 20));// set the font type and size
		textField.setFont(new Font("Arial Bold", Font.PLAIN, 20));// set the font type and size
		Action action = new AbstractAction() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				String word = textField.getText();
				wordArray[arrIndex] =  word;
				System.out.println(arrIndex + " " + wordArray[arrIndex]);
			};
		};
		
		
		BorderFactory.createLoweredBevelBorder();
	//	Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
	//	setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		textField.addActionListener(action);
		for (int i = 0; i < wordTypeArray.length; i++) {
			textLabel.setText("Please enter a/an " + wordTypeArray[i] + ": ");
			arrIndex = i;
			System.out.println(textLabel.getText());
			System.out.println(arrIndex + " " + wordTypeArray[arrIndex]);
			textField.setText(" ");
			displayGui();
			textField.addActionListener(action);
				
			}
	}

	private void displayGui() {
		//textLabel.setLayout(new GridBagLayout());
		textField.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
	
	//////////////////////////First Row  ///////////////////
		
		gc.weightx = 1;
		gc.weighty = 2.0;
		
		gc.gridx=0;
		gc.gridy = 0;
		gc.fill =GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(textLabel, gc);
 		
 		gc.gridx=1;
 		gc.gridy = 0;
 		gc.insets = new Insets(0,0,0,0);
 		gc.anchor = GridBagConstraints.LINE_START;
 		add(textField, gc);
 		wordArray[arrIndex] =  textField.getText();
		System.out.println(arrIndex + " " + wordArray[arrIndex]);
		
	}
}
		


