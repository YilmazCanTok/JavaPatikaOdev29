
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************************************************************");
        System.out.print("Please enter the large of our matrix' line lenght : ");
        int satır = scanner.nextInt();
        System.out.print("Please enter the large of our matrix' column lenght : ");
        int sutun = scanner.nextInt();
        System.out.println("------------------------------------------------------------------------------------");
        int[][] matrix = new int[satır][sutun];
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Your" + (i + 1) + ". line and " + (j + 1) + ". column is :");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Your Matrix is : ");
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("The transpose for your Matrix is : ");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satır; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("************************************************************************************");
    }
}
