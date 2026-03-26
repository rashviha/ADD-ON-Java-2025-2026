import java.util.Scanner;

class Account{
    private String Accholder;
    private int Bank_balance;

    //constructor
    Account(String Accholder_name, int Bank_balance){
        this.Accholder = Accholder_name;
        this.Bank_balance = Bank_balance;
    }
    
    public String getAccholder_name(){
        return Accholder;
    }

    public int getBank_balance(){
        return Bank_balance;
    }

    public void deposit(int amount){
        Bank_balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Updated Bank Balance: " + Bank_balance);
    }

    public void withdraw(int amount){
        if(amount > Bank_balance){
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            Bank_balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Updated Bank Balance: " + Bank_balance);
        }
    }

     public void setAccholder_name(String newName) {
    this.Accholder = newName;
    System.out.println("Account holder name updated successfully!");
}
}
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
     Account ac = new Account("Rashvi", 100000); 
        System.out.println("Account Holder Name: " + ac.getAccholder_name());
        System.out.println("Bank Balance: " + ac.getBank_balance()); 

        System.out.println("Enter the amount to deposit: ");
        int amount = sc.nextInt();
        ac.deposit(amount);

        System.out.println("Enter amount to withdraw: ");
        amount = sc.nextInt();
        ac.withdraw(amount);

        System.out.println("Enter new account holder name: ");
        String newName = sc.next();
        ac.setAccholder_name(newName);
        System.out.println("Updated Account Holder Name: " + ac.getAccholder_name());
        



        
    }
}