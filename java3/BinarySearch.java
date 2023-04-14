import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements inside the array ; ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the element to find ; ");
        int key = sc.nextInt();
        int low = 0;
        int high = n;
        int flag = 0;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                System.out.println("the element is found");
                flag = 1;
                break;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (flag != 1) {
            System.out.println("element is not found");
        }
    }
}