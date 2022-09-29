## Createb by 21343061_Nazwa Nurfadhilla Phitri
Pada Jobsheet 5 ini kita mempelajari Kelas Scanner, Kelas Bufferedreader dan Kelas JOptionpPane.
Untuk bisa menggunakan kelas tersebut kita harus mengimportnya terlebih dahulu kedalam program yaitu dengan cara :
Untuk Kelas Scanner berada pada paket java.util maka cara importnya adalah import java.util.Scanner;
Untuk Kelas Bufferedreader cara importnya terdapat 3 buah dengan cara sebagai berikut : 
a. import java.io.BufferedReader; 
b. import java.io.InputStreamReader; 
c. import java.io.IOException;
Untuk Kelas JOptionPane cara importnya adalah import Javax.swing.JOptionPane; atau bisa ditulis dengan import javax.swing.*;

Untuk pendeklarasian setiap kelas juga berbeda - beda terdiri dari :
a. Kelas Scanner deklarasinya Scanner BacaInput = new Scanner(System.in);
b. Kelas BufferedReader deklarasinya BufferedReader DataMasuk = new BufferedReader (new InputStreamReader(System.in));
c. Kelas JOptionPane deklarasinya Nama = JOptionPane.showInputDialog("Silahkan Masukan Nama Anda"); d

Perbedaan dari ketiga kelas tersebut yaitu :
Untuk Kelas Scanner ketika ada perhitungan matematika maka variabel yang digunakan tidak perlu di konversikan bisa langsung dihitung. Sedangkan Kelas BufferedReader ketika ada perhitungan matematika maka variabel perlu dikonversikan sebelum dihitung. Dan untuk kelas JOptionPane merupakan kelas yang digunakan untuk input dan output data berbasis GUI swing yaitu tampilan berupa dialog box.

Untuk latihan 1 merupakan contoh kelas Scanner, terdapat beberapa tipe data yaitu String, Int dan Float. Untuk membaca tipe data String menggunakan nextLine();, Int menggunakan nextInt();
dan Float menggunakan nextFloat();

Untuk latihan 2 juga dengan kelas Scanner, terdapat variabel dengan tipe data float lalu membaca tipe data tersebut dan setelah itu dihitung atau bisa dibilang program ini adalah Program perhitungan menggunakan Kelas Scanner.

Untuk latihan 3 merupakan contoh penggunaan Kelas BufferedReader. Program untuk membaca tipe data String dengan Kelas BufferedReader dan untuk membacanya dengan menggunakan readLine(); didalam try{} dan untuk catch (IOExeption e) {} IOException adalah untuk membaca apakah inputan itu error atau tidak jika terjadi erorr maka akan dieksekusi ke method yang bersangkutan.

Untuk latihan 4 merupakan program untuk menghitung dan membaca tipe data float atau angka pada Kelas BufferedReader, untuk KelasBufferedReader dalam proses
perhitungan maka perlu di konversikan terlebih dahulu dari String menjadi tipe data yang diinginkan contoh tipe data float maka cara mengkonversinya menggunakan Float.parseFloat(nama_variabel) selajutnya baru bisa dihitung.

Untuk latihan 5 merupakan contoh penggunaan Kelas JOptionPane dimana terdapat tipe data String dengan variabel name dan hoby. serta untuk menampilkan dialog box nya dengan menggunakan (nama_variabel) = JOptionPane.showInputDialog(); dan untuk mencetak dalam layar program kita harus membuat variabel baru dengan isi dari variabel tersebut adalah isi dari variabel yang sudah disimpan dari mengetik dalam Dialog serta untuk menampilkan dengan GUI dengan menggunakan JOptionPane.showMessageDialog(null,(nama_variabel)); dan untuk ke layar program pada java menggunakan system.out.print atau println.

Untuk tugas 1 kita diminta untuk menggunakan 2 kelas yaitu kelas Scanner dan kelas BufferedReader dengan tampilan output yang sudah ditentukan atau bisa dibilang menggabungkan kedua kelas maka caranya kita bisa menggabungkan kedua importan dari kelas Scanner dan Buffered Reader lalu buat deklarasi untuk masing - masing kelas.

Untuk tugas 2 kita diminta menampilkan input dan output menggunakan JOptionPane seperti pada contoh latihan 5 kita harus mengimport JOptionPane terlebih dahulu lalu kita membuat variabel dengan tipe data String setelah itu gunakan showInputDialog(); untuk bisa menampilkan dialog box pada masing - masing variabel.
