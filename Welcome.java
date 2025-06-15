import java.util.Scanner;
public class Welcome{
    static int PNR = -1;
    static String pname = "";
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Online Reservation System");
    System.out.println("Please enter userid"); 
    String userid = sc.nextLine();
    System.out.println("Please enter password");
    int password = sc.nextInt();
    sc.nextLine();

    if (userid.equals("Twisha16") && password == 1234567) {
        System.out.println("Succesfully logged in");
    while (true) {
        System.out.println("How would you like to proceed");
        System.out.println("Please select the number as per your choice");
        System.out.println("Choice 1: Reserve your ticket");
        System.out.println("Choice 2: Cancel your ticket");
        System.out.println("Choice 3: Exit the screen");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        sc.nextLine();
        
        if (choice == 1){
            System.out.println("Please enter the name of the passanger");
            String passangername = sc.nextLine();
            System.out.println("Please enter the name of train");
            String trainname = sc.nextLine();
            PNR = 275990;
            System.out.println("Your ticket is confirmed.");
            System.out.println(" PNR Number is: "+ PNR);
            System.out.println("Name of passanger is: "+ passangername);
            System.out.println("Name of Train is: "+ trainname);
        }
        else if (choice == 2) {
            System.out.println("Enter the PNR of the ticket you would like to cancel");
            int pnr = sc.nextInt();
            sc.nextLine();
            if (pnr == PNR) {
                PNR = -1;
                pname = "";
                System.out.println("Your ticket has been cancelled successfully");  
            }
            else{
                System.out.println("PNR does not exist");
            }
        }
        else if (choice == 3) {
            System.out.println("Okay thank you for visiting");
            break;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
}
    else {
        System.out.println("Incorrect Login Information");
    }

        sc.close();
    
    
}
  
}

