
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {

        int pot = 100;
        int beurten = 1;

        System.out.println();
        System.out.println("Hallo, welkom bij Amerikaanse Roulette!");
        System.out.println("Ik speel 10 rondes roulette met een inleg van €5,- per ronde.");
        System.out.println();
        System.out.println("Ik gok op een willekeurig even of oneven getal van 1 t/m 36.");
        System.out.println("Mijn startbedrag is €100,-. Bij winst krijg ik €5,- uitgekeerd. Bij verlies ben ik €5,- kwijt.");
        System.out.println("Aan het einde kan je zien hoeveel geld je na 10 rondes over hebt.");


        do {
            double randomgok = Math.random() * 35 + 1;
            int gok = (int) randomgok;
            double randomroulette = Math.random() * 35 + 1;
            int roulette = (int) randomroulette;

            System.out.println("Mijn gok is " + gok);
            if (gok % 2 == 0)
                System.out.println("Dit is een EVEN getal.");
            else
                System.out.println("Dit is een ONEVEN getal.");

            System.out.println("Roulette geeft " + roulette);
            if (roulette % 2 == 0)
                System.out.println("Dit is EVEN!");
            else
                System.out.println("Dit is ONEVEN!");

            if ((gok % 2 == 0 & roulette % 2 == 0) | (gok % 2 > 0 & roulette % 2 > 0)) {
                System.out.println();
                System.out.println("BINGO! Je ontvangt €5,-!");
                pot = pot + 5;
                System.out.println("Er zit nu €" + pot + ",- in de pot!");
            } else {
                System.out.println();
                System.out.println("BUMMER! Je verliest €5,-!");
                pot = pot - 5;
                System.out.println("Er zit nu €" + pot + ",- in de pot!");
            }
            beurten++;
            System.out.print("NOG EEN KEER? (ja of nee):  ");
            System.out.println();
            System.out.println();
            var n = new Scanner(System.in);
            var nogeenkeer = n.nextLine();
            nogeenkeer = nogeenkeer.toLowerCase();
            if (nogeenkeer.equals ("nee"))
                beurten = 11;
            System.out.println();
            System.out.println("Tot ziens!");
        } while (beurten < 11);
    }
}







