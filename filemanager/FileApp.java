public class FileApp implements UIEventHandler{
    FileManager fm;
    public FileApp(){
        this.fm = new FileManager();
    }

    public static void main(String[] args){
      userInterface ui = new TextBasedInterface();
      ui.subscribe(new FileApp());
      ui.start();
    }
    @Override
    public void onList(String directoryPath){
       this.fm.listFiles(directoryPath);
    }
    @Override
    public void onCreate(String directoryPath){
       this.fm.createDirectory(directoryPath);
    }
    @Override
    public void onDelete(String directoryOrFilePath){
       this.fm.deleteFileOrDirectory(directoryOrFilePath);
    }
}