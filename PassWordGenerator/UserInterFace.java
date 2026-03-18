package PassWordGenerator;

public interface UserInterFace{
    public int length();
    public boolean wantLowerCase();
    public boolean wantUpperCase();
    public boolean wantNumbers();
    public boolean wantSpecialChars();
    public void displayPassWord(String passWord);
}
