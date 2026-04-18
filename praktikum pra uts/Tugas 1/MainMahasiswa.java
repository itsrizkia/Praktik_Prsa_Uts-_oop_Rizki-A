public class MainMahasiswa {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Rizki";
        m1.nim =  "I.2510276";

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Ell";
        m2.nim = "230101002";

        Mahasiswa m3 = new Mahasiswa();
        m3.nama = "Rivan";
        m3.nim = "230101003";

        m1.tampilkanNama();
        m1.tampilkanNim();
        m1.olahraga();

        m2.tampilkanNama();
        m2.tampilkanNim();
        m2.olahraga();

        m3.tampilkanNama();
        m3.tampilkanNim();
        m3.olahraga();
    }
}