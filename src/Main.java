import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] dni = {"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek"};

        String[] pulaLekcji = {
                "Matematyka", "Programowanie", "Angielski", "Fizyka",
                "W-F", "Chemia", "Historia", "Polski", "Religia"
        };

        String[] godziny = {"8:00", "8:45", "9:35", "10:25", "11:25", "12:10", "13:10", "14:00", "14:50"};

        Random random = new Random();

        System.out.println("WYLOSOWANY PLAN LEKCJI NA TYDZIEŃ");

        for (int dzien = 0; dzien < dni.length; dzien++) {
            System.out.println("\n" + dni[dzien] + ":");

            for (int i = 0; i < godziny.length; i++) {
                int losowyIndeks = random.nextInt(pulaLekcji.length);
                String wylosowanaLekcja = pulaLekcji[losowyIndeks];

                System.out.println("  " + godziny[i] + " - " + wylosowanaLekcja);
            }
        }
    }
}
