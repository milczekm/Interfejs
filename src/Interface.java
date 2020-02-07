public class Interface {
    public static void main (String[] args) {

        Raporty r = new Raporty();
        r.tytul = "RAP01";

        r.generujRaport(r.tytul);
        System.out.println(r.rapWygenerowanyPrzez("Andrzej"));

        r.pokaz(r.tytul);
        r.drukuj(r.tytul);

        System.out.println(r.usunRaport(r.tytul));

    }
}
