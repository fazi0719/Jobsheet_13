import java.util.Scanner;

public class tugas {
    static int totalRekursif(int n, int[] data) {
        if (n == 1) {
            return data[0]; 
        } else {
            return data[n - 1] + totalRekursif(n - 1, data);
        }
    }

    static int totalIteratif(int n, int[] data) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] data = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            data[i - 1] = sc.nextInt();
        }

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: "
                + totalRekursif(N, data));

        sc.close();
    }
}
