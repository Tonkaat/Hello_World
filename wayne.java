import java.util.Scanner; 

public class wayne {
    
    public static void main(String[] args) {


        System.out.println("Input Username: ");
        Scanner word = new Scanner(System.in);
        
        System.out.println("Input Password: ");
        Scanner pass = new Scanner(System.in);
        

        System.out.println("Your Name: " + word.nextLine() + "Password: " + pass.nextLine());

    }
}
