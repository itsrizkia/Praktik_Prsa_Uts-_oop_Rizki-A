public class MobilBaru {
    String merk;
    int tahun;

    MobilBaru(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    void tampil() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}