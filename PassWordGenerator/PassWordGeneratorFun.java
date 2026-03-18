package PassWordGenerator;
import java.util.Random;
public class PassWordGeneratorFun {

    public PassWordGeneratorFun(){
    }
    public String geratePassWord(int length,boolean wantLowerCase,boolean wantUpperCase,boolean wantNumbers,boolean wantSpecialChars){
           Random random = new Random();
           String LowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
           String UpperCasaLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           String SpecialChars = "!@#$%^&*()?";
           String digits = "0123456789";
           StringBuilder allChars = new StringBuilder();
           
           if(wantLowerCase) allChars.append(LowerCaseLetters);
           if(wantSpecialChars) allChars.append(SpecialChars);
           if(wantUpperCase) allChars.append(UpperCasaLetters);
           if(wantNumbers) allChars.append(digits);
           StringBuilder passWord = new StringBuilder();
           boolean validPassword = false;
        do{
            validPassword = false;
            for(int i = 0; i < length; i++ ){
                char c = allChars.charAt(random.nextInt(allChars.length()));
                passWord.append(c);
            }
            if(valid(passWord.toString(),wantLowerCase,wantUpperCase,wantNumbers,wantSpecialChars))
                validPassword = true;
            else{
                validPassword = false;
            }
        }while(!validPassword);
     
        if(!validPassword){
            System.out.print("Unable to Generate the Password : ");
            return "Invalid Password";
        }
        else{
            System.out.print("Congratutlations the password is : ");
            return passWord.toString();
        }
    }
    public boolean valid(String password, boolean wantLowerCase, boolean wantUpperCase, boolean wantNumbers, boolean wantSpecialChars){
        if(wantLowerCase && !password.matches(".*[a-z].*")) return false;
        if(wantUpperCase && !password.matches(".*[A-Z].*")) return false;
        if(wantNumbers && !password.matches(".*[0-9].*")) return false;
        if(wantSpecialChars && !password.matches(".*[!@#$%^&*()?).]*")) return false;
        return true;
    }
}
