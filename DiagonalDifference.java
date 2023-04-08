import java.util.Scanner;
import java.lang.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];
            secondarySum += arr[i][n - 1 - i];
        }
        int diff = primarySum - secondarySum;
        System.out.println(Math.abs(diff));
    }
}
