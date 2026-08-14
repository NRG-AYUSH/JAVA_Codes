import java.util.Scanner;

public class MissingNumber {
    public static void number(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Number " + i + " is there");
            } else {
                System.out.println("The number missing is " + i);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int size;
        System.out.println("enter the size of array");
        size = sn.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value of arr[" + i + "]");
            array[i] = sn.nextInt();
        }

        number(array, size);
        sn.close();
    }
}