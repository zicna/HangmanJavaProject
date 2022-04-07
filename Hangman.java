import java.util.Arrays;
import java.util.Scanner;

public class Hangman{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String wordToGuess = randomWord(); 
        System.out.println(wordToGuess);

        System.out.println(gallows(0));

        System.out.print("Word:\t");
        // System.out.println(Arrays.toString(stringToArray(randomWord())));
        String[] arrayOfStrings = stringToArray(wordToGuess);
        printPlaceholders(arrayOfStrings);

        System.out.println("Misses: ");
        String[] misses = new String[6];
        System.out.print("Guess: ");
        String guessChar = scan.nextLine();

        if(checkGuess(guessChar,arrayOfStrings)){
            updatePlaceholders(arrayOfStrings, guessChar);
        }else{
            printPlaceholders(arrayOfStrings);
            for(int i =0; i < misses.length; i++){
                if(misses[i].equals(null)){
                    misses[i] = guessChar;
                }
            }
        }
        System.out.println("Misses: " + Arrays.toString(misses));



    scan.close();
    }

    public static String randomWord(){
        String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
        
        int randomNumber = (int)(Math.random() * words.length);
        return words[randomNumber];
    }

    public static boolean checkGuess(String guessChar, String[] arrayOfStrings){
        boolean check = false;
        for(int i =0; i < arrayOfStrings.length; i++){
            if(arrayOfStrings[i].equals(guessChar)){
                check = true;
            }
        }
        return check;
    }

    public static String[] stringToArray(String word){
        return (word.split(""));
    }

    public static void printPlaceholders(String[] array){
        for(int i =0; i < array.length; i++){
            System.out.print("_ ");
        }
        System.out.print("\n");
    }

    public static void updatePlaceholders(String[] array, String guessChar){
        for(int i =0; i < array.length; i++){
            if(array[i].equals(guessChar)){
                System.out.println(guessChar + " ");
            }else{
                System.out.print("_ ");
            }
        }
    }   

    public static void printMissedGuesses(String guessChar){
        System.out.print(guessChar);
    }

    public static String gallows(int misses){
        switch(misses){
            case 0: 
            return 
                "+---+\n" +
                "|   |\n" +
                "    |\n" +
                "    |\n" +   //if the user didn't miss any guesses.
                "    |\n" +
                "    |\n" +
                "=========\n";
            case 1: 
            return 
                "+---+\n" +
                "|   |\n" +
                "O   |\n" +   //if the user missed one guess.
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "=========\n";
            case 2: 
            return 
                "+---+\n" +
                "|   |\n" +
                "O   |\n" +    //if the user missed two guesses.
                "|   |\n" +
                "    |\n" +
                "    |\n" +
                "=========\n";
            case 3: 
            return 
                " +---+\n" +
                " |   |\n" +
                " O   |\n" +   //if the user missed three guesses.
                "/|   |\n" +
                "     |\n" +
                "     |\n" +
                " =========\n";
            case 4: 
            return 
                " +---+\n" +
                " |   |\n" +
                " O   |\n" +
                "/|\\  |\n"+   //if the user missed four guesses.
                "     |\n" +
                "     |\n" +
                " =========\n";
            case 5: 
            return 
                " +---+\n" +
                " |   |\n" +
                " O   |\n" +
                "/|\\  |\n" +  //if the user missed five guesses.
                "/    |\n" +
                "     |\n" +
                " =========\n";
            case 6: 
            return 
                " +---+\n" +
                " |   |\n" +
                " O   |\n" +
                "/|\\  |\n" +   //if the user missed six guesses.
                "/ \\  |\n" +
                "     |\n" +
                " =========\n";
            default: return "";
        }
    }
};
        
    
        
    
        
    
        
    
        
    
        
