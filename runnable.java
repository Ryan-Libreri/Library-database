import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
class runnable{
    public static void main (String []args){
        ArrayList<Library> LibraryList = new ArrayList<Library>();
        
        int choice = 0;

        do{
            Library l= new Library(); 
            
            String menu= JOptionPane.showInputDialog(null, "Main Menu\n\n1.Add record\n2.Edit Record\n3.Delete record\n4.Display records\n5.Search fro record\n6.Sort records\n7.Exit\n\n Enter your choice", JOptionPane.INFORMATION_MESSAGE);

            choice = Integer.parseInt(menu);

            switch (choice) {
                case 1: 
                    //System.out.println("Add Record");
                    l.createNewlibrary(LibraryList);
                    LibraryList.add(l);
                    pressEnter();
                    
                    break;

                case 2: 
                    //System.out.println("Edit Record");
                    l.editLibrary(LibraryList);
                    pressEnter();
                    break;

                case 3: 
                    System.out.println("Delete Record");
                    pressEnter();
                    break;

                case 4: 
                   // System.out.println("Display Record");
                   l.displaylibrary(LibraryList);
                    pressEnter();
                    break;

                case 5: 
                    System.out.println("Search Record");
                    pressEnter();
                    break;

                case 6: 
                    System.out.println("Sort Record");
                    pressEnter();
                    break;
                    
                case 7: 
                    System.out.println("Exit");
                    pressEnter();
                    break;
                    
                default:    
                    System.out.println("Incorrect choice please enter another choice");
                    pressEnter();
            }
        }while (choice!= 7);
    }
    
    static void pressEnter(){
        Scanner input=new Scanner(System.in);
        System.out.print("press enter to continue");
        String enter= input.nextLine();
        System.out.println("\f");
    }
}