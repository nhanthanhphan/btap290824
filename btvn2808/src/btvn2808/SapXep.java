
package btvn2808;
import java.util.Arrays;
import java.util.Scanner;
public class SapXep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("mang sau khi sap xep theo thu tu tang dan:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
