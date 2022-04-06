public class Hangman{
    public static void main(String[] args) {
        System.out.println(randomWord());
        System.out.println(gallows(0));
    }

    public static String randomWord(){
        String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
        
        int randomNumber = (int)(Math.random() * words.length);
        return words[randomNumber];
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
        
    
        
    
        
    
        
    
        
    
        
