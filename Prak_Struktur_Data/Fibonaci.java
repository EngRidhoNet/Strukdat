package UTS.Prak_Struktur_Data;

public class Fibonaci {
    public static void main(String[] args) {
        FibonaciRecursive f = new FibonaciRecursive();
        int n = 10;
        System.out.println("Deret Fibonacci hingga elemen ke-" + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(f.fibonaci(i) + " ");
        }
    }
}

class FibonaciRecursive {
    public static int fibonaci(int n) {
        if (n <= 1) { 
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
}