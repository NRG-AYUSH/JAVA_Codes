import java.util.Scanner;
public class SumOfFirst {
   static public int sumIterative(int n)
{
    
    if(n==1||n==0){
       System.out.println("HURRRR"); 
        return n;

    }
    else{
        

    
    return n+sumIterative(n-1);}
}
   


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
                System.out.println("Enter the number");
int number = sn.nextInt();
sn.close();
    System.out.println("the sum is "+sumIterative(number));}
} 
    

