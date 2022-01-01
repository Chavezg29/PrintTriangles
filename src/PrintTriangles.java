import java.util.Scanner;

public class PrintTriangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows: ");
        n = input.nextInt();
        printPowerOf2Triangle(n);
        printPascalTriangle1(n);
        printPascalTriangle2(n);
    }
    public static void printPowerOf2Triangle(int numRows) {
        int size = numRows;
        int max = (size * 2) - 1;
        for (int i = 0; i <= size - 1; i++){
            int jCount = 0;
            int jCount2 = i - 1;
            for (int j = 0; j <= max; j++){
                if (j < size - i || j > size + i){
                    System.out.print("  ");
                } else {
                    if (jCount <= i){
                        int n = (int) Math.pow(2, jCount);
                        if (n < 10){
                            System.out.print(" " + n + " ");
                        } else if (n < 100){
                            System.out.print(" " + n + " ");
                        } else {
                            System.out.print(n + " ");
                        }
                        jCount++;
                    } else {
                        int n = (int) Math.pow(2, jCount2);
                        if (n < 10){
                            System.out.print(" " + n + " ");
                        } else if (n < 100){
                            System.out.print(" " + n + " ");
                        } else {
                            System.out.print(n + " ");
                        }
                        jCount2--;
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static  void printPascalTriangle1(int numRows){
        numRows++;
        long[][] triangle = new long[numRows][numRows];
        triangle[1][1] = 1;
        System.out.print(triangle[1][1] + "\n");

        for (int i = 2; i < numRows; i++){
            for (int j = 1; j < numRows; j++){
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i- 1][j];
                if (triangle[i][j] > 0){
                    if (j > 1 && triangle[i][j] < 10){
                        System.out.print(" " + triangle[i][j] + " ");
                    } else {
                        System.out.print(triangle[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printPascalTriangle2(int numRows){
        numRows++;
        int[][] triangle = new int[numRows][numRows];
        int x = 1;
        while (x < numRows - 1){
            System.out.print(" ");
            x++;
        }
        triangle[1][1] = 1;
        System.out.print(" " + triangle[1][1] + "\n");

        for (int i = 2; i < numRows; i++){
            x = i;
            while (x < numRows - 1){
                System.out.print(" ");
                x++;
            }
            for (int j = 1; j < numRows; j++){
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i -1][j];
                if (triangle[i][j] > 0){
                        if (triangle[i][j] < 10){
                            System.out.print(" " +  triangle[i][j] + " ");
                        } else if (triangle[i][j] < 100){
                            System.out.print(" " + triangle[i][j] + " ");
                        } else {
                            System.out.print(triangle[i][j] + " ");
                        }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
