import java.util.Scanner;
import java.util.Random;
public class GuessLogicOfWord{
    private int attempts;
    private String wordToGuess;
    private char[] guessedCahracters;
    private int Win = 0,Loss =0;
    // already used charcaters
    public GuessLogicOfWord(String wordList[],int maxAttempts){
          Random random = new Random();
          int index = random.nextInt(wordList.length);
          this.wordToGuess = wordList[index];
          this.attempts = maxAttempts;
          this.guessedCahracters = new char[wordToGuess.length()];
          for(int i = 0; i<guessedCahracters.length; i++){
              guessedCahracters[i] = '_';
          }
    }

    public void play(){
      Scanner scanner = new Scanner(System.in);
     try{    
        boolean wantToPlay = true;
        do{
            boolean userWon = false;
            while(attempts>0 && !userWon){
                System.out.println("You have "+ attempts+" Attempts");
                System.out.print("Enter a character :..... ");
                char letter = scanner.nextLine().toLowerCase().charAt(0);
                
                if(processLetter(letter)){
                    System.out.print("Your Guess is Correct..!  ");
                    if(new String(guessedCahracters).equals(wordToGuess)){
                        System.out.print("\nCongratulations You Guessed the Word : "+ wordToGuess);
                        userWon = true;
                        Win++;
                        break;
                    }
                }else{
                    System.out.print("Your Guess is Incorrect..!  ");
                    attempts--;
                } 
                showWord();           
            }
            if(!userWon) {
                System.out.println("Sorry You Lost the Game..! The Word was : "+wordToGuess+" ");
                Loss++;
            }
            System.out.println("Win : "+Win+"  Loss : "+Loss+"\n");
            System.out.print("Do you want to Play Again .. ");
            wantToPlay = scanner.nextLine().toLowerCase().startsWith("y");
            resetGame();
        }while(wantToPlay);
     
        System.out.println("Thanks for Playing the Game..! ");    
     }catch(Exception e){
        System.out.println("Exception occurred ... Restart the Game");
     }finally{
        scanner.close();
     }
 }
    public void showWord(){
        for(char c : guessedCahracters){
            System.out.print(c+" ");
        }
        System.out.println("\n");
    }
    public boolean processLetter(char letter){
        boolean found = false;
        for(int i = 0;i<wordToGuess.length();i++){
            if(wordToGuess.charAt(i)==letter && guessedCahracters[i]=='_'){
                found = true;
                guessedCahracters[i] = letter;
            }
        }
        return found;
    }

    public void resetGame(){
        // logic to reset the game
        // generate new word
        String words[] = {"programming","language","computer","science","engineering","java"};
        Random random = new Random();
        int index = random.nextInt(words.length);
        this.wordToGuess = words[index];
        this.attempts = 10;
        this.guessedCahracters = new char[wordToGuess.length()];
        for(int i = 0; i<guessedCahracters.length; i++){
            guessedCahracters[i] = '_';
        }
    }
}