import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Checking checking = new Checking();
        Savings savings = new Savings();
        int choice=0;
        do {
            System.out.println("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings now\n" +
                    "8. Quit");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    checking.withdraw(scan.nextDouble());
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    savings.withdraw(scan.nextDouble());
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    checking.deposit(scan.nextDouble());
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    savings.deposit(scan.nextDouble());
                    break;
                case 5:
                    System.out.println(checking);
                    break;
                case 6:
                    System.out.println(savings);
                    break;
                case 7:
                    savings.interest();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid input. Please try again");
                    break;
            }
        }
        while(choice!=8);
    }
}

