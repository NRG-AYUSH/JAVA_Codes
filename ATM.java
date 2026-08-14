import java.util.*;
public class ATM {
    private double balance = 500;

    public void withdraw(double amount) {
        if (amount > balance) {
            // Explicitly triggering an exception right here!
            throw new ArithmeticException("Insufficient balance in your account!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }

public static void main(String args[]){
    double amount1;
    Scanner sn = new Scanner(System.in);
System.out.println("Enter the amount");
amount1 = sn.nextDouble();
ATM r = new ATM();
r.withdraw(amount1);
sn.close();
}}