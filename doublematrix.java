import java.util.Scanner;

public class doublematrix {
    public static void main(String[] args) {
        int size;
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        size = sn.nextInt();

        int[][] matrix = new int[size][size];

        // 1. Take 2D input
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter value at [" + i + "][" + j + "]: ");
                matrix[i][j] = sn.nextInt();
            }
        }

        // 2. Calculate Main Diagonal Sum (O(N) time)
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        // 3. Output result
        System.out.println("\nSum of main diagonal = " + sum);

        sn.close();
    }
}