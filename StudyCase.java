import java.util.Arrays;
import java.util.Scanner;

public class StudyCase {

    public static int[] generateArray(int N) {
        if (N <= 0) {
            return new int[0]; // Jika N <= 0, Maka array kosong
        }

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            if (i <= 1) {
                a[i] = 1;
            } else {
                a[i] = a[i - 1] + a[i - 2];
            }
        }
        return a;
    }

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Array : ");
        int N = scanner.nextInt();
        
        int[] result = generateArray(N);

        
        System.out.println("Array untuk N = " + N + ": " + Arrays.toString(result));
    }
}