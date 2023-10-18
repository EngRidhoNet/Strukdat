package UTS.Prak_Struktur_Data;

public class Segitiga {
     public int triangleRecur(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangleRecur(n - 1);
        }
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        for (int i = 1; i <= 10; i++) {
            int result = segitiga.triangleRecur(i);
            System.out.print(result + ", ");
        }
    }
}
