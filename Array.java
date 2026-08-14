import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [][]arr= new int[10][10];
        Scanner sn = new Scanner(System.in);
        for(int i = 0;i<10;i++){
            System.out.println("Enter the value at"+i);
            arr[i][i]= sn.nextInt();

        }
        for(int i =0;i<10;i++){
            
            System.err.println(arr[i][i]);
            
        }sn.close();
    }
}