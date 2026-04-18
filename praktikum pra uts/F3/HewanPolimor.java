public class HewanPolimor {
    public static void main(String[] args) {
        Hewan h;

        h = new Hewan();
        h.suara();

        h = new Herbivora();
        h.suara();

        h = new Karnivora();
        h.suara();

        h = new Kelinci();
        h.suara();
    }
}