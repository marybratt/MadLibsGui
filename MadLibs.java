import java.util.Scanner;

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
		System.out.println("The Best Halloween Party Ever");
		System.out.println("Last night I went to the most "+ wordArray[0] + " Halloween party! The invitation was delivered by ");
		System.out.println(wordArray[1] + " and told me to go to the deep dark " + wordArray[2] + " and " + wordArray[3] + " all the ");
		System.out.println("way to the very top of the spooky "+ wordArray[4] + ". I " + wordArray[5] + " the doorbell "+ wordArray[6] + ". ");
		System.out.println(wordArray[7] + "! My friend "+ wordArray[8] + " answered the door dressed up as " + wordArray[9]);
		System.out.println("and said  '" + wordArray[10] + "!' There were " + wordArray[11] + " different costumes, including ");
		System.out.println(wordArray[12] + " ghouls and mummified " + wordArray[13] + ". The music was loud and " + wordArray[14] + ",");
		System.out.println("so I " + wordArray[15] + " until my " + wordArray[16] + " hurt. There were also delicious treats to ");
		System.out.println(wordArray[17] + ", like candy corn and chocolate-covered "+ wordArray[18] + ", but my favourite part of ");
		System.out.println("the party was the pumpkin " + wordArray[19] + " and bobbing for " + wordArray[20] + ". ");
		System.out.println("I can't wait until next Halloween - it will be even more "+ wordArray[21] + "!");
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
# MadLibs
