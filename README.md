PERCOBAAN 1
1. Apa yang dimaksud dengan fungsi rekursif?
jawab: Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri untuk menyelesaikan suatu masalah, sampai mencapai kondisi tertentu yang disebut kondisi dasar (base case)
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!
jawab: menghasilkan nilai yang sama,tetapi cara kerjanya berbeda. Fungsi rekursif memecah masalah menjadi sub-masalah lebih kecil dengan memanggil dirinya sendiri berulang kali hingga mencapai kasus dasar, menggunakan tumpukan panggilan (call stack), sedangkan fungsi iteratif menggunakan perulangan (loop) seperti for atau while untuk mengulang blok kode yang sama hingga kondisi berhenti terpenuhi, tanpa overhead pemanggilan fungsi.

PERCOBAAN 2
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan,pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!
Jawab: Proses pemanggilan fungsi rekursif hitungPangkat(x, y) akan berjalan terus selama nilai y belum sama dengan 0.
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32

PERCOBAAN 3
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
Jawab: - base case 
            if (tahun == 0) {
            return saldo;
        } else {
       - recursion call
            return (1.11  * hitungLaba(saldo, tahun - 1));
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)
Jawab: - fase ekspansi 
            hitungLaba(100000, 3)
            = 1.11 * hitungLaba(100000, 2)
            = 1.11 * (1.11 * hitungLaba(100000, 1))
            = 1.11 * (1.11 * (1.11 * hitungLaba(100000, 0)))
            = 1.11 * (1.11 * (1.11 * 100000))
       - fase subtitusi
            hitungLaba(100000, 0) = 100000
            hitungLaba(100000, 1) = 1.11 × 100000 = 111000
            hitungLaba(100000, 2) = 1.11 × 111000 = 123210
            hitungLaba(100000, 3) = 1.11 × 123210 = 136763.1

