import java.awt.Font;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class MadLibs {
	// The story I have used was found on 
	// https://docs.google.com/viewer?url=http://www.scholastic.ca/clubs/images/activities/ACT_HalloweenMadLibs_10_2012.pdf
	// declare global arrays and populate the type of words needed
	public static String [] wordTypeArray = {"Adjective", "Animal", "Place", "Verb", "Noun", "Verb (Past Tense)",
			"Adverb", "Exclamation", "Friend's Name", "Celebrity", "Silly Word", "Number",
			"Adjective", "Noun (Plural)", "Adjective", "Verb (Past Tense)", "Body Part (Plural)", 
			"Verb", "Noun (Plural)", "Verb (ending in -ing)", "Noun (Plural)", "Adjective"};
		public static String [] wordArray = new String[22];
	
	public static void main(String[] args) {
		// get user input
		getWords();
		// display story with user input
		printStory();
	}

	private static void printStory() {
		// Display story with user input words inserted in the story
		JFrame f = new JFrame("The Best Halloween Party Ever");
		f.setSize(1500, 600);// set the size of the frame
		f.setResizable(false); // make the frame so that it cannot be resized
		JTextArea story = new JTextArea();
		Border typeBorder = BorderFactory.createLoweredBevelBorder();//set border type
		story.setBorder(typeBorder);
		story.setFont(new Font("Arial Bold", Font.PLAIN, 30));// set the font type and size
		story.setText("Last night I went to the most "+ wordArray[0] + " Halloween party! The invitation was delivered by\n ");
		story.append(wordArray[1] + " and told me to go to the deep dark " + wordArray[2] + " and " + wordArray[3] + " all the \n");
		story.append("way to the very top of the spooky "+ wordArray[4] + ". I " + wordArray[5] + " the doorbell "+ wordArray[6] + ". \n");
		story.append(wordArray[7] + "! My friend "+ wordArray[8] + " answered the door dressed up as " + wordArray[9]  + "\n");
		story.append("and said  '" + wordArray[10] + "!' There were " + wordArray[11] + " different costumes, including \n");
		story.append(wordArray[12] + " ghouls and mummified " + wordArray[13] + ". The music was loud and " + wordArray[14] + ",\n");
		story.append("so I " + wordArray[15] + " until my " + wordArray[16] + " hurt. There were also delicious treats to \n");
		story.append(wordArray[17] + ", like candy corn and chocolate-covered "+ wordArray[18] + ", but my favourite part of \n");
		story.append("the party was the pumpkin " + wordArray[19] + " and bobbing for " + wordArray[20] + ". \n");
		story.append("I can't wait until next Halloween - it will be even more "+ wordArray[21] + "!");
		story.setEditable(false);// make the JTextField uneditable
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // handle the close of frame
		f.setAlwaysOnTop(true);
		f.setLocationRelativeTo(null);// set to middle of screen
		f.add(story);// add the text field to the JFrame
		f.setVisible(true);//make visible
	}

	private static void getWords() {
		// display the type of word that needs to be entered and then save in wordArray
		// using the same order
		Scanner input = new  Scanner(System.in);
		for (int i = 0; i < wordTypeArray.length; i++) {
			System.out.print("Please enter a/an " + wordTypeArray[i] + ": ");
			String word = input.next();
			wordArray[i] = word;
		}
		input.close();
	}
}
//# MadLibs
# MadLibs
