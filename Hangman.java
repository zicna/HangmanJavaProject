import java.util.Arrays;
import java.util.Scanner;

public class Hangman{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String wordToGuess = randomWord(); 
        int misses = 0; 
        String missedLetters = "";
        String[] arrOfLetters = stringToArray(wordToGuess);
        String[] arrPlaceholders = placeholderArray(arrOfLetters);


        while(misses < 6){
            System.out.println(gallows(misses));
            System.out.print("Word:\t");
            printPlaceholders(arrPlaceholders);

            System.out.println("Missed: " + missedLetters);

            System.out.print("Guess: ");
            String guessChar = scan.nextLine();

            boolean goodGuess = false;
            
            for(int i =0; i < arrOfLetters.length; i++){
                if(arrOfLetters[i].equals(guessChar)){
                    goodGuess = true;
                    System.out.println("Good guess");
                    arrPlaceholders[i] = guessChar;
                }
            }
            if(!goodGuess){
                missedLetters += guessChar;
                misses++;
            }

            if(Arrays.equals(arrOfLetters, arrPlaceholders)){
                System.out.println(wordToGuess);
                System.out.println("You WON!!!");
                System.exit(0);
            }
        }
        System.out.println("Sorry more luck next time");

    scan.close();
    }

    public static String randomWord(){
        String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
        
        int randomNumber = (int)(Math.random() * words.length);
        return words[randomNumber];
    }

    public static boolean checkGuess(String guessChar, String[] arrOfLetters){
        boolean check = false;
        for(int i =0; i < arrOfLetters.length; i++){
            if(arrOfLetters[i].equals(guessChar)){
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
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static String[] placeholderArray(String[] array){
        String[] placeholders = new String[array.length];
        for(int i = 0; i < array.length; i++){
            placeholders[i] = "_";
        }

        return placeholders;
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
        
// System.out.println(Arrays.toString(stringToArray(randomWord())));
    
        
    
        
    
        
    
        
    
        
