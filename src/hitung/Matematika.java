
package hitung;


// Nama class: Matematika
public class Matematika {
    
    // Deklarasi variabel bil1 dan bil2 dengan tipe data double
    private double bil1;
    private double bil2;

    // Constructor untuk mengisi nilai bil1 dan bil2
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;  // Mengisi nilai bil1
        this.bil2 = bil2;  // Mengisi nilai bil2
    }

    // Method untuk penjumlahan: bil1 + bil2
    public double setPenjumlahan() {
        return bil1 + bil2;
    }

    // Method untuk pengurangan: bil1 - bil2
    public double setPengurangan() {
        return bil1 - bil2;
    }

    // Method untuk perkalian: bil1 * bil2
    public double setPerkalian() {
        return bil1 * bil2;
    }

    // Method untuk pembagian: bil1 / bil2
    public double setPembagian() {
        // Cek agar tidak terjadi pembagian dengan nol
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return 0; // Nilai default jika pembagian tidak valid
        }
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Matematika dengan bil1 = 12.0 dan bil2 = 4.0
        Matematika hitung = new Matematika(12.0, 4.0);

        // Menampilkan hasil semua operasi
        System.out.println("Hasil Penjumlahan  : " + hitung.setPenjumlahan());
        System.out.println("Hasil Pengurangan  : " + hitung.setPengurangan());
        System.out.println("Hasil Perkalian     : " + hitung.setPerkalian());
        System.out.println("Hasil Pembagian     : " + hitung.setPembagian());
    }
}

