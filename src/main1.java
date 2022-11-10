import java.util.concurrent.ThreadLocalRandom;

        public class main1 {

            public static final String PAPIER = "papier";
            public static final String NOZYCZKI = "nożyczki";
            public static final String KAMIEN = "kamień";

            public static final String player1Choice = randomStringFromArr();
            public static final String player2Choice = randomStringFromArr();
            public static final String gracz1 = "Maciej", gracz2 = "Piotr";

            public static String randomStringFromArr() {
                String[] pkn = {PAPIER, KAMIEN, NOZYCZKI};
                int randIdx = ThreadLocalRandom.current().nextInt(pkn.length);
                String randomElem = pkn[randIdx];
                return randomElem;

            }

            public static void main(String[] args) {
                //gracz1 = "Maciej";
                //gracz2 = "Piotr";
                //String player1Choice, player2Choice;
                int result = gameResult(player1Choice, player2Choice);
                System.out.println("Imiona dzisiejszych graczy to: " + gracz1 + " oraz " + gracz2);



            }
            private static int gameResult(String player1Choice, String player2Choice) {
                int licznik1 = 0;
                int licznik2 = 0;
                System.out.println(gracz1 + " wylosował: " + player1Choice);
                System.out.println(gracz2 + " wylosował " + player2Choice);

                for (int i = 0; i <= 19; i++) {


                    if (player1Choice.equals(player2Choice)){
                        return 0;
                    } else if ((player1Choice.equals(NOZYCZKI) && player2Choice.equals(PAPIER)) {
                        return 1;
                    } else if ((player1Choice.equals(NOZYCZKI) && (player2Choice.equals(KAMIEN)) {
                        return 2;
                    } else if ((player1Choice.equals(PAPIER) && (player2Choice.equals(NOZYCZKI)) {
                        return 2;
                    } else if ((player1Choice.equals(PAPIER) && (player2Choice.equals(KAMIEN)) {
                        return 1;
                    } else if ((player1Choice.equals(KAMIEN) && (player2Choice.equals(NOZYCZKI)) {
                        return 1;
                    } else if ((player1Choice.equals(KAMIEN) && (player2Choice.equals(PAPIER) {
                        return 2;
                    }
                }

                System.out.println("Gracz " + gracz1 + " wygrał: " + licznik1 + " razy");
                System.out.println("Gracz " + gracz2 + " wygrał: " + licznik2 + " razy");
            }
        }
}
