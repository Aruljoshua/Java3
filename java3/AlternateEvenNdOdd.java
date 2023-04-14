import java.util.Scanner;

public class AlternateEvenNdOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in  an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 1; i < arr.length; i++) {
            int sum = 0;
            sum = arr[i] + arr[i - 1];
            if (sum % 2 != 0) {
                flag += 1;
                if (i == n - 1) {
                    flag += 1;
                    break;
                }
            }
        }

        if (flag == n) {
            System.out.println("the array is correct sequence");
        } else {
            System.out.println("not a correct sequence");
        }
    }

}
