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
        System.out.println("Invalid input. Please enter a valid interest                                 rate.");
        scanner.next();
      }
    }

    System.out.println("Would you like a personal personal or business                               loan?");
    String loanType;

    while (true) {
      if (scanner.hasN) {
        currentInterestRate = scanner.nextDouble();
        break;
      } else {
        System.out.println("Invalid input. Please enter personal or                                     business.");
        scanner.next();
      }
    }

  }
}
