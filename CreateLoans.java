import java.util.Scanner; 

public class CreateLoans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current prime interest rate?");
        double currentInterestRate;

        while (true) {
            if (scanner.hasNextDouble()) {
                currentInterestRate = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid interest rate.");
                scanner.next(); 
            }
        }
        


    }
}
