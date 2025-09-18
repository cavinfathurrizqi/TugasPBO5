# TugasPBO5
Koneksi JFrame Form Netbeans dengan PostgreSQL serta Exception Java di Netbeans.
# KONEKSI JFRAME FORM dengan POSGRESQL
Konektivitas antara JFrame Form dan tabel di PostgreSQL adalah proses menghubungkan aplikasi Java berbasis GUI dengan basis data PostgreSQL agar data dapat ditampilkan, ditambahkan, diubah, atau dihapus langsung melalui antarmuka pengguna. JFrame Form berperan sebagai tampilan interaktif yang berisi komponen seperti tombol, text field, dan tabel, sedangkan PostgreSQL menyimpan data dalam bentuk tabel. Koneksi dilakukan menggunakan JDBC (Java Database Connectivity), sehingga setiap aksi pada JFrame Form, seperti menekan tombol simpan atau hapus, akan diterjemahkan menjadi perintah SQL yang dieksekusi pada tabel PostgreSQL.
# JFRAME FORM NEATBEANS
JFrame Form di NetBeans adalah jendela utama dalam aplikasi GUI berbasis Java Swing yang berfungsi sebagai wadah untuk menampilkan berbagai komponen antarmuka seperti label, tombol, text field, dan tabel. Dengan memanfaatkan fitur drag-and-drop pada NetBeans, pembuatan tampilan menjadi lebih mudah karena kode antarmuka dihasilkan secara otomatis, sehingga programmer hanya perlu menambahkan logika atau event handler pada setiap komponen. JFrame Form memudahkan pengembangan aplikasi Java yang interaktif dan user-friendly tanpa harus menulis seluruh kode GUI secara manual.
# EXCEPTIONS JAVA di NETBEANS
Exception Java adalah mekanisme penanganan kesalahan (error handling) yang digunakan untuk mengatasi kondisi tidak normal saat program berjalan, seperti kesalahan input, pembagian dengan nol, atau akses data yang tidak valid. Exception memungkinkan program tetap berjalan tanpa langsung berhenti, karena kesalahan dapat ditangani menggunakan blok try, catch, dan finally, atau dengan membuat exception khusus (custom exception).
# Langkah-langkah Pembuatan Projek JFrame Gui
1. Membuat Database PostgreSQL dan Create Tablenya
2. Membuat Project di NetBeans, beri nama project, Data Siswa.
3. Buat package bernama Data Murid, Di dalam package tersebut buat file: Koneksi.java → untuk koneksi database, DataSiswa.java (JFrame Form) → GUI utama,Bank.java → simulasi exception handling.
4. Klik kanan pada package DataMurid → New → JFrame Form → beri nama Datasiswa.
5. Tambahkan komponen GUI:
- JLabel untuk label teks ( Nama , Absen, Wali murid, dan Wali kelas).
- JTextField untuk input data.
- JButton untuk Insert, Update, Delete, Clear, Exit.
- JTable untuk menampilkan data siswa.
# Langkah-langkah Pembuatan Projek Exception
1. Buat project baru: File → New Project → Java Application dan beri nama project, misalnya PraktikumException.
2. Buat package bernama praktikum5, Di dalam package tersebut buat file:Bank.java → program utama untuk simulasi.
3. Membuat Custom Exception (misalnya SaldoTidakCukupException ).
4. Di Bank.java, tambahkan atribut untuk melihat Saldo
5. Membuat Method TarikUang() yang berisi program untuk Validasi input uang yang akan ditarik, Periksa apakah saldo cukup, Tandai saldo sebagai saldo menvukupi jika berhasil, Hitung kembalian.
