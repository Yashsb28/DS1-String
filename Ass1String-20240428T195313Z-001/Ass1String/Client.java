import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String serverURL = "rmi://localhost/Server";
            Serverintf serverintf = (Serverintf) Naming.lookup(serverURL);
            System.out.print("Enter Your First String ");
            String str1 = sc.nextLine();
            System.out.print("Enter Your Second String ");
            String str2 = sc.nextLine();
            
            
            System.out.println(" ------------------- Results-------------------");
           
            if (serverintf.equalString(str1 , str2)) {
                System.out.println("Your Both String are Equal !!");
            }
            else
            {
                System.out.println("Your Both String are NOT Equal !!");
            }

        } catch (Exception e) {
            System.out.println("Exception Occurred at Client!" + e.getMessage());
        }
    }
}


//javac  *.java
//rmiregistry
//java Server
// java Client
