import java.util.*;
public class TextBasedInterface implements userInterface{
    
    private UIEventHandler handler = null;
    

    @Override
    public void start(){
         System.out.println("Welcome to File Manager");
         System.out.println("1. List files");
         System.out.println("2. Create a directory");
         System.out.println("3. Delete a file or directory");
         System.out.println("4. Exit...");

         System.out.print("Enter your Choice ");
         Scanner scanner = new Scanner(System.in);
    while(true){
         int choice = scanner.nextInt();
         scanner.nextLine();

         switch(choice){
            case 1: 
                  System.out.print("Enter Directory Path: ");
                  handler.onList(scanner.nextLine());
                  break;
            case 2: 
                  System.out.print("Enter a new Directory Parth: ");
                  handler.onCreate(scanner.nextLine());
                  break;
            case 3:
                  System.out.print("Enter File or Directory Path to delete: ");
                  handler.onDelete(scanner.nextLine());
                  break;
            case 4:
                  System.out.println("Exiting ...");
                  scanner.close();
                  return;
            default:
                  System.out.println("Invalid choice");
         }
    }

    }
    @Override
    public void subscribe(UIEventHandler handler){
       if(this.handler==null){
        this.handler = handler;
       }
    }
}