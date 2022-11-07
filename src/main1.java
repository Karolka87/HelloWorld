import java.util.concurrent.ThreadLocalRandom;

        public class main1 {

            public static final String PAPIER = "papier";
            public static final String NOZYCZKI = "nożyczki";
            public static final String KAMIEN = "kamień";

            public static String randomStringFromArr() {
                String[] pkn = {PAPIER, KAMIEN, NOZYCZKI};
                int randIdx = ThreadLocalRandom.current().nextInt(pkn.length);
                String randomElem = pkn[randIdx];
                return randomElem;

            }

            public static void main(String[] args) {
                String gracz1, gracz2;
                gracz1 = "Maciej";
                gracz2 = "Piotr";
                String player1Choice, player2Choice;
                int licznik1 = 0;
                int licznik2 = 0;
                System.out.println("Imiona dzisiejszych graczy to: " + gracz1 + " oraz " + gracz2);


                private static int gameResult(String player1Choice, String player2Choice) {


                for (int i = 0; i <= 19; i++) {
                    player1Choice = randomStringFromArr();
                    player2Choice = randomStringFromArr();

                    System.out.println(gracz1 + " wylosował: " + player1Choice);
                    System.out.println(gracz2 + " wylosował " + player2Choice);

                    if (player1Choice.equals(player2Choice)){
                        System.out.println("Gra zakończyła się remisem");
                    } else if ((player1Choice.equals(NOZYCZKI) && (player2Choice.equals(PAPIER)) {
                        System.out.println("Wygrał " + gracz1);
                        licznik1++;
                    } else if (player1Choice.equals(NOZYCZKI) && (player2Choice.equals(KAMIEN)) {
                        System.out.println("Wygrał " + gracz2);
                        licznik2++;
                    } else if (player1Choice.equals(PAPIER) && (player2Choice.equals(NOZYCZKI)) {
                        System.out.println("Wygrał " + gracz2);
                        licznik2++;
                    } else if (player1Choice.equals(PAPIER) && (player2Choice.equals(KAMIEN)) {
                        System.out.println("Wygrał " + gracz1);
                        licznik1++;
                    } else if (player1Choice.equals(KAMIEN) && (player2Choice.equals(NOZYCZKI)) {
                        System.out.println("Wygrał " + gracz1);
                        licznik1++;
                    } else if (player1Choice.equals(KAMIEN) && (player2Choice.equals(PAPIER) {
                        System.out.println("Wygrał " + gracz2);
                        licznik2++;
                    }
                }

                }
                System.out.println("Gracz " + gracz1 + " wygrał: " + licznik1 + " razy");
                System.out.println("Gracz " + gracz2 + " wygrał: " + licznik2 + " razy");
            }
        }

