import java.util.*;
class Atm{
    float balance;
    int pin=1234;
    Scanner sc = new Scanner(System.in);
    void checkPin(){
        System.out.println("Enter The Pin");
        int checkPin = sc.nextInt();
        if(checkPin == pin){
            menu();
        }
        else{
            System.out.println(" Invalid pin");
        }
    }
    void menu(){
        System.out.println("\nATM Menu:");
        System.out.println("1.  Checkbalance");
        System.out.println("2.  DepositBalance");
        System.out.println("3.  WithdrawBalance");
        System.out.println("4.  Change PIN");
        System.out.println("5.  exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                checkBalance();
                break;
            case 2:
                depositBalance();
                break;
            case 3:
                withdrawBalance();
            case 4:
                changePin();
                break;
            case 5:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                menu();
        }
    }
        void checkBalance(){
            System.out.println("Your Balance is : " + balance);
            menu();
        }
        void depositBalance(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Amount To Deposit : ");
            float deposit = sc.nextFloat();
            if(deposit >0){
                balance = balance + deposit; 
                System.out.println("Amount Will Be Successfully Deposit");
            }
            else{
                System.out.println("Negative value Not Be Valid");
            }
        menu();
        }
        void withdrawBalance(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Amount To withdraw : ");
            float amount = sc.nextFloat();
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew $" + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient funds. Unable to withdraw.");
            } else {
                System.out.println("Withdraw amount must be greater than zero.");
                menu();   
            }
        }
        void changePin(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your new pin :");
            int num= sc.nextInt();
            pin = num;
            System.out.println("PIN Change Successfully");
        }
    }    
class AtmMachine{
    public static void main(String[] args) {
        Atm a = new Atm();
        a.checkPin();
        a.menu();
    }
}
