public class App {
    public static void main(String[] args){
        String words[] = {"programming","language","computer","science","engineering","java"};
        System.out.println("\n             Let's Start the Game....`(-__-)`...!!\n");
        GuessLogicOfWord game = new GuessLogicOfWord(words, 10);
        game.play();
    }
}
