package PassWordGenerator;

public class App {
    public static void main(String[] args) {
        PassWordGeneratorFun passWordGenerator = new PassWordGeneratorFun();
        UserInterFace ui = new TextBasedUserInterface();
        int length = ui.length();
        boolean wantLowerCase = ui.wantLowerCase();
        boolean wantUpperCase = ui.wantUpperCase();
        boolean wantNumbers = ui.wantNumbers();
        boolean wantSpecialChars = ui.wantSpecialChars();
       String passWord =  passWordGenerator.geratePassWord(length,wantLowerCase,wantUpperCase,wantNumbers,wantSpecialChars);
       ui.displayPassWord(passWord);
    }
}
