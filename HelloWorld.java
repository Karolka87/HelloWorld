import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HelloWorld {

    public class main1 {

        public static String randomStringFromArr() {
            String[] pkn = {"papier", "kamień", "nożyczki"};
            int randIdx = ThreadLocalRandom.current().nextInt(pkn.length);
            String randomElem = pkn[randIdx];
            return randomElem;

        }

        public static void main(String[] args) {
            String gracz1, gracz2;
            gracz1 = "Maciej";
            gracz2 = "Piotr";
            String x, y;
            x = randomStringFromArr();
            y = randomStringFromArr();
            System.out.println("Imiona dzisiejszych graczy to: " + gracz1 + " oraz " + gracz2);
            System.out.println(gracz1 + " wylosował: " + x);
            System.out.println(gracz2 + " wylosował " + y);

            if (x == "nożyczki" && y == "nożyczki") {
                System.out.println("Gra zakończyła się remisem");
            }
            else if (x == "nożyczki" && y == "papier") {
                System.out.println("Wygrał " + gracz1);
            }
            else if (x == "nożyczki" && y == "kamień") {
                System.out.println("Wygrał " + gracz2);
            }
            else if (x == "papier" && y == "nożyczki") {
                System.out.println("Wygrał " + gracz2);
            }
            else if (x == "papier" && y == "papier") {
                System.out.println("Gra zakończyła się remisem");
            }
            else if (x == "papier" && y == "kamień") {
                System.out.println("Wygrał " + gracz1);
            }
            else if(x == "kamień" && y == "nożyczki") {
                System.out.println("Wygrał " + gracz1);
            }
            else if (x == "kamień" && y == "papier") {
                System.out.println("Wygrał " + gracz2);
            }
            else if(x == "kamień" && y == "kamień") {
                System.out.println("Gra zakończyła się remisem");
            }
        }
    }