import java.util.Scanner;

public class NumberOf7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in an array");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 7) {
                    count += 1;
                }
            }
        }
        System.out.println("the number of seven's in the 2d array : " + count);
    }
}
