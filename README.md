# Katalon-Petstore-Web

Project otomasi pengujian **web** menggunakan **Katalon Studio** untuk aplikasi demo JPetStore (OctoPerf)(https://petstore.octoperf.com/actions/Catalog.action).

---

## 📋 Deskripsi Project

Project ini menguji alur utama aplikasi JPetStore: registrasi akun, sign in / sign out, pemilihan kategori, pencarian produk, keranjang, dan checkout. Pengujian dibuat dengan pendekatan Page Object (Object Repository), Custom Keyword, dan Data-Driven Testing (DDT).

* **Target aplikasi** : (https://petstore.octoperf.com/actions/Catalog.action)
* **Tools** : Katalon Studio 10.4.3 (WebUI)
* **Bahasa** : Groovy

---

## 📂 Struktur Folder

| Folder | Isi |
| --- | --- |
| `Test Cases/` | 11 test case (positif dan negatif) |
| `Test Suites/` | 9 test suite |
| `Object Repository/` | Test object (locator XPath) per halaman |
| `Keywords/` | Custom keyword: `login.Login`, `searching.Search_Product_Dogs` |
| `Data Files/` + `Sign In.xlsx` | Data untuk DDT |
| `Profiles/default.glbl` | Global Variable (URL dan akun) |
| `Report-Sample/` | Contoh hasil eksekusi Test Suite (HTML, CSV, JUnit XML) |

---

## 🚀 Cara Menjalankan

> **Prasyarat:** Katalon Studio 10.x, Google Chrome (atau browser lain yang didukung Katalon), koneksi internet.
1. Clone repository: git clone https://github.com/shellysiarangi/katalon-petstore-web.git
2. Buka Katalon Studio, pilih **File > Open Project**, lalu pilih file `katalon-petstore-web.prj`.
3. Buka folder **Test Suites**, pilih satu Test Suite (misal `SignIn Negatif DDT`).
4. Pilih browser (misal Chrome), lalu klik **Run**.
5. Hasil eksekusi muncul di folder **Reports**.

---

## 🔑 Kredensial dan Global Variable

Tidak ada kredensial yang ditulis langsung di script. Semua nilai dibaca dari **Global Variable** :

| Variable | Fungsi |
| --- | --- |
| `base_url` | URL aplikasi JPetStore |
| `login_username`, `login_password` | Akun demo publik JPetStore untuk sign in |
| `register_userid`, `register_password` | Data akun baru untuk test registrasi |

Nilai tersebut adalah akun demo publik dari situs latihan JPetStore, bukan akun pribadi atau kredensial asli.

---

## 🧪 Test Suite

| Test Suite | Test Case | Jenis |
| --- | --- | --- |
| `Sign In dan Sign Out` | `SignIn_SignOut` | Positif |
| `SignIn Negatif DDT` | `SignIn_Negatif_DDT` (data `Sign In.xlsx`, 3 baris) | Positif dan negatif, DDT |
| `Register` | `Register` | Positif |
| `Search Product/Search Product Dogs` | `Search_Product_Dogs` (custom keyword, kata kunci acak) | Positif |
| `Search Product/Search Product Fish` | `Search_Product_Fish` (data internal, 4 baris) | Positif, DDT |
| `Verify Pilih Menu Kategori` | `Pilih_Kategori_Navbar`, `Pilih_Kategori_Sidebar`, `Pilih_Kategori_Image` | Positif |
| `CheckOut/With Sign In` | `Checkout_Fish_With_SignIn` | Positif |
| `CheckOut/Without Sign In` | `CheckOut_Fish_Without_SignIn` | Negatif |
| `Check_Keranjang_Without_SignIn` | `Check_Keranjang_Without_SignIn` | Negatif |

---

## 📊 Test Coverage

| Fitur | Skenario | Pengecekan |
| --- | --- | --- |
| Sign In / Sign Out | Login valid lalu logout | Elemen Sign Out tampil |
| Sign In (DDT) | Valid (`P`), password salah (`NP`), username salah (`NU`) | Pesan `Invalid username or password. Signon failed.` untuk kasus negatif |
| Registrasi | Isi form akun baru dan simpan | Alur form sampai tombol Save |
| Kategori | Birds, Cats, Dogs, Fish, Reptiles lewat navbar, sidebar, dan image | Elemen kategori terlihat |
| Pencarian | Produk Dogs (keyword acak) dan Fish (4 data DDT) | Product ID dan nama produk tampil |
| Keranjang | Akses keranjang tanpa login | Teks `Your cart is empty.` |
| Checkout | Dengan login (Angelfish) dan tanpa login | Tanpa login: pesan `You must sign on before attempting to check out...` |

Total: **11 test case**, **9 test suite**, 2 test case memakai DDT. Contoh report ada di folder `Report-Sample/`.

---

## 📝 Catatan

* Test registrasi memakai `register_userid` tetap. JPetStore menolak user ID yang sudah terdaftar, jadi ganti nilainya jika test registrasi dijalankan ulang.
* Aplikasi demo bersifat publik dan dipakai banyak orang, sehingga data dan kecepatan responnya bisa berubah.
