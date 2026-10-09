# Tugas PBO - Inheritance, Encapsulation, dan Polymorphism

Repositori ini berisi penyelesaian tugas Pemrograman Berbasis Objek (PBO) mengenai konsep Inheritance (Pewarisan), Encapsulation (Pengapsulan), dan Polymorphism (Polimorfisme) dalam bahasa pemrograman Java.

### 1. Encapsulation (Pengapsulan)
* Seluruh atribut/variabel dalam kelas menggunakan kata kunci `private` atau `protected` untuk membatasi akses langsung dari luar kelas.
* Pengaksesan dan pembaruan nilai variabel dilakukan melalui metode *getter* dan *setter* (seperti `getWarna()`, `setWarna()`, `getSisi()`, `getTinggi()`, dll.).

### 2. Inheritance (Pewarisan)
* **`Bentuk`** bertindak sebagai *superclass* utama yang menyimpan properti umum seperti `warna`.
* **`BujurSangkar`** menuruni kelas `Bentuk` (`extends Bentuk`).
* **`Lingkaran`** menuruni kelas `Bentuk` (`extends Bentuk`).
* **`Silinder`** menuruni kelas `Lingkaran` (`extends Lingkaran`), sehingga mewarisi atribut dan metode dari `Lingkaran` sekaligus `Bentuk`.

### 3. Polymorphism (Polimorfisme)
* Penerapan *Method Overriding* dilakukan pada metode `printInfo()` di kelas `BujurSangkar`, `Lingkaran`, dan `Silinder`.
* Setiap *subclass* memberikan implementasi khusus pada metode `printInfo()` untuk menampilkan informasi spesifik dari bangun/bentuk tersebut.

---

## 💻 Hasil Eksekusi Program (Running Output)
<img width="1717" height="999" alt="image" src="https://github.com/user-attachments/assets/fa4f45ae-bc35-4d38-b650-274dddd2539e" />

