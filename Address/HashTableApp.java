package Address;

public class HashTableApp {
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
        hashTable.insert(21);
        hashTable.displayTable();

        // Menambahkan data baru
        System.out.println("Menambahkan data baru");
        hashTable.insert(19);
        hashTable.insert(13);
        hashTable.insert(14);
        hashTable.insert(16);
        hashTable.insert(18);
        hashTable.displayTable();

        // Baris Kode dibawah untuk mencari data
        Data find = hashTable.find(19);
        if (find == null)
            System.out.println("Data tidak ditemukan");
        else
            System.out.println("Data ditemukan : " + find.getKey());

         // Baris Kode dibawah untuk menghapus tabel
        Data delete = hashTable.delete(10);
        if (delete == null)
        System.out.println("Data Tidak Ada");
        else
        System.out.println("Data Terhapus : " + delete.getKey());
        hashTable.displayTable();


    }

}

class quadratic{
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(18);
        hashTable.insertQuadratic(656);
        hashTable.insertQuadratic(715);
        hashTable.insertQuadratic(658);
        hashTable.insertQuadratic(777);
        hashTable.insertQuadratic(837);
        hashTable.insertQuadratic(899);
        hashTable.insertQuadratic(899);
        hashTable.insertQuadratic(15);
        hashTable.insertQuadratic(420);
        hashTable.insertQuadratic(898);
        hashTable.displayTable();
    }
}
