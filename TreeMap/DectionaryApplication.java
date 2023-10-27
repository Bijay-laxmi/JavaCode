//Write a Java program that demonstrates the functionality of this dictionary application
//using a TreeMap. Your program should include the following features:
//i)A TreeMap named dictionary to store word-definition pairs.
//ii)A way to input word-definition pairs and add them to the dictionary.
//iii)A way to retrieve and display the definition of a specific word.
//iv)An iteration through the dictionary to display all word-definition pairs in
//alphabetical order based on words.

package TreeMap;


	import java.util.Scanner;
	import java.util.TreeMap;

	public class DectionaryApplication {
	    public static void main(String[] args) {
	    	
	    
	        TreeMap<String, String> dictionary = new TreeMap<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Dictionary");
	            System.out.println("1. Add Word-Definition Pair");
	            System.out.println("2. Retrieve Definition for a Word");
	            System.out.println("3. Display All Word-Definition Pairs");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline

	            switch (choice) {
	                case 1:
	                    // Add a word-definition pair to the dictionary
	                    System.out.print("Enter a word: ");
	                    String word = scanner.nextLine();
	                    System.out.print("Enter the definition: ");
	                    String definition = scanner.nextLine();
	                    dictionary.put(word, definition);
	                    System.out.println("Word-Definition pair added to the dictionary.");
	                    break;
	                case 2:
	                    // Retrieve and display the definition for a specific word
	                    System.out.print("Enter the word to retrieve the definition: ");
	                    String lookupWord = scanner.nextLine();
	                    String lookupDefinition = dictionary.get(lookupWord);
	                    if (lookupDefinition != null) {
	                        System.out.println("Definition: " + lookupDefinition);
	                    } else {
	                        System.out.println("Word not found in the dictionary.");
	                    }
	                    break;
	                case 3:
	                    // Display all word-definition pairs in alphabetical order
	                    System.out.println("Word-Definition Pairs in Alphabetical Order:");
	                    for (String key : dictionary.keySet()) {
	                        String value = dictionary.get(key);
	                        System.out.println(key + ": " + value);
	                    }
	                    break;
	                case 4:
	                    // Exit the program
	                    System.out.println("Exiting Dictionary.");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            } }
	        
	
	}
	}


