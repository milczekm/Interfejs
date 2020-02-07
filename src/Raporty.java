public class Raporty extends Raport implements RaportyInterface {
    String tytul;

    @Override
    public void pokaz(String str){
        System.out.println("Raport " + str + " wyświetlany na ekranie");
    }

    @Override
    public void drukuj(String str){
        System.out.println("Drukowanie raportu " + str);
    }

    @Override
    public String usunRaport (String str) {
        return "Raport " + str + " usunięty z systemu";
    }

    @Override
    public void generujRaport (String str) {
        System.out.println("Przygotowywanie raportu " + str);
    }
}
