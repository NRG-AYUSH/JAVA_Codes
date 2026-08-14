import java.util.Scanner;

public class arrayandsearching {

    public int min(int[] mini, int s) {
        int mininumber, temp;

        // Loop stops at s - 1 to avoid mini[i + 1] index out-of-bounds crash
        for (int i = 0; i < s - 1; i++) {
            if (mini[i] > mini[i + 1]) {
                temp = mini[i];
                mini[i] = mini[i + 1];
                mini[i + 1] = temp;
            }
        }

        // After swapping adjacent elements, checking bounds
        mininumber = mini[0];
        
        // Print the largest value pushed toward the end
        System.out.println("The maximum value is " + mini[s - 1]);
        
        return mininumber;
    }

    public static void main(String[] args) {
        int size;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the value of size: ");
        size = sn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value at arr[" + i + "]:");
            arr[i] = sn.nextInt();
        }

        sn.close();

        arrayandsearching r1 = new arrayandsearching();
        System.out.println("The min value is " + r1.min(arr, size));
    }
}