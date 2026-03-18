import java.io.*;
public class FileManager{
    public void listFiles(String directoryPath){
        File directory = new File(directoryPath);
        if(directory.exists() && directory.isDirectory()){
            File[] contents = directory.listFiles();
            if(contents !=null && contents.length!=0){
                for(File file: contents){
                    if(file.isDirectory()){
                        System.out.println("[Dir] "+file.getName());
                    }else{
                        System.out.println("[File] "+file.getName());
                    }
                }
            }else{
               System.out.println("Directory is Empty");
            }
        }else{
            System.out.println("Invalid directory path: Path either doesn't exist or is not a directory");
        }
    }
    public void createDirectory(String directoryPath){
        File directory = new File(directoryPath);
        if(directory.mkdir()){
            System.out.println("Directory has created SuccessFully");
        }else{
            System.out.println("Error Occured while creating Directory");
        }
    }
    public void deleteFileOrDirectory(String directoryOrFilePath){
        File directory = new File(directoryOrFilePath);

        if(directory.delete()){
           System.out.println("Deleted Successfully");
        }else{
            System.out.println("Error Occured while deleting File or Directory");
        }
    }
}