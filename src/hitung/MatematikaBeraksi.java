
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {

        // Membuat objek Matematika dengan nama variabel sesuai NPM
        Matematika _2310010229 = new Matematika(2, 9);

        // Menampilkan hasil semua operasi
        System.out.println("Hasil Penjumlahan  : " + _2310010229.setPenjumlahan());
        System.out.println("Hasil Pengurangan  : " + _2310010229.setPengurangan());
        System.out.println("Hasil Perkalian     : " + _2310010229.setPerkalian());
        System.out.println("Hasil Pembagian     : " + _2310010229.setPembagian());
    }
}

