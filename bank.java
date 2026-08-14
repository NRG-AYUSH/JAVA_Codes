import java.util.Scanner;

class Bankaccount {
    double balance = 1000;

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("the balance is"+balance);
        }
    }
}

class savings extends Bankaccount {
    @Override
void withdraw(double amount){
    balance = balance -amount-50.0;
    System.out.println("the balance is now"+balance);
}
}class bank{


public static void main(String []args)
{
    Bankaccount r1 = new savings();
    Bankaccount r2 =new Bankaccount();
    System.out.println("select the account to withdraw money");
    System.out.println("press one for saving and two for main account");
    int select;
Scanner sn = new Scanner(System.in);

    select = sn.nextInt();
    double amountt;
    if(select==1){
    System.out.println("entr the amount to withdraw");
    amountt=sn.nextDouble();
    r1.withdraw(amountt);
    
}
else{
    System.out.println("enter amont to withdraw");
    amountt = sn.nextDouble();
    r2.withdraw(amountt);
}
sn.close();}}