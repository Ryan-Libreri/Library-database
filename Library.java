import java.util.Scanner;
import java.util.ArrayList;

class Library{
    int userID;
    String name;
    String bookName;
    int dateBorrowed;
    int dateReturned;
    boolean found;
    
    Scanner input=new Scanner(System.in);   
    
    
    public void createNewlibrary(ArrayList<Library>LibraryList){
        System.out.println("Create New UserID");
        int userID =input.nextInt();
        input.nextLine();
        for (Library l : LibraryList){
            if(l.getuserID() ==userID){
               found = true;
               System.out.println("UserId is not unique!");
               break;
            }
        }
        if(!found){
          System.out.println("Enter name of the person who has borrowed the book");
          String name = input.nextLine();
          System.out.println("Enter the Book's name");
          String bookname = input.nextLine();
          System.out.println("Enter date when book was borrowed from library");
          //char dateBorrowed = input.nextchar();
          char dateBorrowed = input.next().charAt(0);
          System.out.println("Enter date when book has to be returned to the library");
          //int dateReturned = input.nextInt();
          char dateReturned = input.next().charAt(0);
          
          this.userID = userID;
          this.name = name;
          this.dateBorrowed = dateBorrowed;
          this.dateReturned = dateReturned;
          
          LibraryList.add(this);
        }
    }//end method
    
    
    public void displaylibrary(ArrayList<Library>LibraryList){
        System.out.println("/nSize of ArrayList : " + LibraryList.size() + "\n");
        
        for (Library l : LibraryList){
            System.out.println(l);
        }
    }
    
    public void editLibrary(ArrayList <Library> LibraryList){
        found = false;
        System.out.println("Enter User ID");
        int userIDSearch = input.nextInt();
        input.nextLine();
        
        for (Library l : LibraryList){
            if (l.getuserID() == userIDSearch){
                System.out.println("User ID Found");
                System.out.println("--------------------\n");
                
                System.out.println("User ID");
                System.out.println("--------------------\n");
                
                System.out.println(l +"\n");
                System.out.println(" Press (E) to edit or any other key to exit");
                String choice = input.nextLine();
                if (choice.equals("E")){
                    System.out.println("\nEnter Name of the client: ");
                    l.setName(input.nextLine());
                    System.out.println("\nEnter new book title taken: ");
                    l.setName(input.nextLine());
                    System.out.println("\nEnter new date for when the book was borrowed: ");
                    l.setdateBorrowed(input.nextInt());
                    input.nextLine();
                    System.out.println("\nEnter new date for when book has to be returned: ");
                    l.setdateReturned(input.nextInt());
                    input.nextLine();
                    break;
                    
                }else{
                  break;  
                }//end of nested IF
                
            }else{
               found = false; 
            }
        }
    }
    
    public void deletelibrary(ArrayList<Library>LibraryList){
        found = false;
        System.out.println("Please enter userId for the record that you wish to delete : ");
        int userID =input.nextInt();
    }
        
    public String toSring(){
      return("userID"+ getuserID() + ", Name" + getname() + ", Date when book was purchased" + getdateBorrowed() + ", Date when book has to be returned" + getdateReturned()); 
    }
    
    int getuserID (){
        return userID;
    }
    
    String getname (){
        return name;
    }
    
    int getdateBorrowed (){
        return dateBorrowed;
    }
    
    int getdateReturned (){
        return dateReturned;
    }
    
    void setUserID(int userID){
        this.userID = userID;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    void setdateBorrowed(int dateBorrowed){
        this.dateBorrowed = dateBorrowed;
    }
    
    void setdateReturned(int dateReturned){
        this.dateReturned = dateReturned;
    }
    
}