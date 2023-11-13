package Hashing;

public class HashChainApp {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(15);
        hashTable.insert(43);
        hashTable.insert(23);
        hashTable.insert(42);
        hashTable.insert(44);
        hashTable.insert(56);
        hashTable.insert(78);
        hashTable.insert(79);
        hashTable.insert(10);
        hashTable.insert(21);
        hashTable.insert(15);
        hashTable.displayTable();

        // Menambahkan data baru
        System.out.println("Menambahkan data baru");
        hashTable.insert(19);
        hashTable.insert(13);
        hashTable.insert(14);
        hashTable.insert(16);
        hashTable.insert(18);
        hashTable.displayTable();
    }
}
