public class MainPewarisan {
    public static void main(String[] args) {

        Mahasiswa2 m = new Mahasiswa2();
        m.nama = "Budi";
        m.umur = 20;
        m.nim = "123456";
        m.tampilMhs();

        System.out.println();

        Dosen d = new Dosen();
        d.nama = "Dr. Ahmad";
        d.umur = 40;
        d.nidn = "654321";
        d.tampilDosen();
    }
}