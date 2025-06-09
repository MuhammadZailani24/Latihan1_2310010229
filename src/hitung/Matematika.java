
package hitung;


public class Matematika {
    
    // Deklarasi variabel bil1 dan bil2 dengan tipe data double
    private double bil1;
    private double bil2;

    // Constructor untuk mengisi nilai bil1 dan bil2
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;  // Mengisi nilai bil1 dengan nilai parameter bil1
        this.bil2 = bil2;  // Mengisi nilai bil2 dengan nilai parameter bil2
    }

    // Method setPenjumlahan yang mengembalikan hasil penjumlahan bil1 dan bil2
    public double setPenjumlahan() {
        return bil1 + bil2;  // Mengembalikan hasil penjumlahan bil1 + bil2
    }

    // Method main untuk mencoba class Matematika
    public static void main(String[] args) {
        // Membuat objek Matematika dengan nilai bil1 = 10.5 dan bil2 = 4.5
        Matematika hitung = new Matematika(10.5, 4.5);
        
        // Menampilkan hasil penjumlahan
        System.out.println("Hasil Penjumlahan: " + hitung.setPenjumlahan());
    }
}
