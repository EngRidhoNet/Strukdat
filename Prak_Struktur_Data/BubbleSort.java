package UTS.Prak_Struktur_Data;

public class BubbleSort {
    public int[] arr;
    private int nElemen;

    public BubbleSort(int max) {
        arr = new int[max];
        nElemen++;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void bubbleSortDesc() {
        int i, j;
        for (i = 0; i < nElemen; i++) {
            for (j = 0; j < nElemen; j++) {
                if (arr[i] > arr[j]) {
                    swap(i, j);
                }
            }
        }
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}

class BubbleSortApp {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(10);
        System.out.println("Bubble Sort App");
        int[] data = { 4, 2, 1, 4, 5, 7, 1, 7, 8 };
        // Input Data
        for (int i : data) {
            bubbleSort.insert(i);
        }
        System.out.println("Sebelum Diurutkan");
        bubbleSort.display();
        // Proses Pengurutan
        bubbleSort.bubbleSortDesc();
        // Menampilkan Data
        System.out.println("Setelah Diurutkan");
        bubbleSort.display();
    }
}
