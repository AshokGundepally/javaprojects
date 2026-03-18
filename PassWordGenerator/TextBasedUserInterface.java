package PassWordGenerator;
import java.util.Scanner;

public class TextBasedUserInterface implements UserInterFace{
    
    Scanner scanner ;
    public TextBasedUserInterface(){
        scanner = new Scanner(System.in);
    }
 
    @Override
    public int length() {
        System.out.print("Length Of the Password ");
        return scanner.nextInt();
    }
    @Override
    public boolean wantLowerCase(){
        System.out.print("Include LowerCase Letters (y/n). ");
        return scanner.next().equalsIgnoreCase("y");
    }
    @Override
    public boolean wantUpperCase(){
        System.out.print("Include UpperCase Letters (y/n). ");
        return scanner.next().equalsIgnoreCase("y");
    }
    @Override
    public boolean wantNumbers(){
        System.out.print("Include Numbers (y/n). ");
        return scanner.next().equalsIgnoreCase("y");
    }
    @Override
    public boolean wantSpecialChars(){
        System.out.print("Include Special Characters (y/n). ");
        return scanner.next().equalsIgnoreCase("y");
    }
    @Override
    public void displayPassWord(String passWord){
        System.out.print(passWord);
    }
}
