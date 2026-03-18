package RollingDiceGame;
import java.util.Random;
import java.util.Scanner;
public class RollingDice{
    public static void main(String[] args){

        boolean playGame = true;
       
        do{
           try{
                System.out.println("Enter number of times you want to roll the dice");
                Scanner sc = new Scanner(System.in);
                int test = sc.nextInt();
                Random ran = new Random();
                while(test -->0){
                int faceVal  = ran.nextInt(6)+1; // to nullify the 0
                System.out.println(getPrint(faceVal)+"\t\t");
                }
                sc.close();
                playGame = false;
            }catch(Exception e){
                System.out.println("The Exception is "+(e.getMessage()) +" ---> "+ "Enter a number");
            }
        }while(playGame);
    }
    public static String getPrint(int faceVal){
        return switch(faceVal){
            case 1-> "-----------\n| *       |\n|         |\n|         |\n-----------\n";
            case 2-> "-----------\n| *     * |\n|         |\n|         |\n-----------\n";
            case 3-> "-----------\n| *     * |\n| *       |\n|         |\n-----------\n";
            case 4-> "-----------\n| *     * |\n| *     * |\n|         |\n-----------\n";
            case 5-> "-----------\n| *     * |\n| *     * |\n| *       |\n-----------\n";
            case 6-> "-----------\n| *   *   |\n| *   *   |\n| *   *   |\n-----------\n";
            default -> "nothing to display";
        };
    }
}