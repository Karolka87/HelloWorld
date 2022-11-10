import java.util.concurrent.ThreadLocalRandom;

public class main1 {

    public static final String PAPIER = "papier";
    public static final String NOZYCZKI = "nozyczki";
    public static final String KAMIEN = "kamien";
    public static final String SPOCK = "spock";
    public static final String JASZCZURKA = "jaszczurka";


    public static final String gracz1 = "Maciej", gracz2 = "Piotr";

    public static String randomStringFromArr() {
        String[] pkn = {PAPIER, KAMIEN, NOZYCZKI, SPOCK, JASZCZURKA};
        int randIdx = ThreadLocalRandom.current().nextInt(pkn.length);
        String randomElem = pkn[randIdx];
        return randomElem;

    }

    public static void main(String[] args) {
        System.out.println("Imiona dzisiejszych graczy to: " + gracz1 + " oraz " + gracz2);
        int player1Result = 0;
        int player2Result = 0;


        for (int i = 0; i <= 19; i++) {
            String player1Choice = randomStringFromArr();
            String player2Choice = randomStringFromArr();

            System.out.println(gracz1 + " wylosowal: " + player1Choice);
            System.out.println(gracz2 + " wylosowal: " + player2Choice);

            int result = gameResult(player1Choice, player2Choice);

            if (result == 1) {
                player1Result++;
            }
            else if (result == 2) {
                player2Result++;
            }
            else if (result == 0) {
            }
        }
        System.out.println(gracz1 + " wygrał " + player1Result + " razy");
        System.out.println(gracz2 + " wygrał " + player2Result + " razy");

    }

    private static int gameResult(String player1Choice, String player2Choice) {



        if (player1Choice.equals(player2Choice)) {
            return 0;
        } else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(PAPIER)) {
            return 1;
        } else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(KAMIEN)) {
            return 2;
        } else if (player1Choice.equals(PAPIER) && player2Choice.equals(NOZYCZKI)) {
            return 2;
        } else if (player1Choice.equals(PAPIER) && player2Choice.equals(KAMIEN)) {
            return 1;
        } else if (player1Choice.equals(KAMIEN) && player2Choice.equals(NOZYCZKI)) {
            return 1;
        } else if (player1Choice.equals(KAMIEN) && player2Choice.equals(PAPIER)) {
            return 2;
        }else if (player1Choice.equals(SPOCK) && player2Choice.equals(KAMIEN)) {
            return 1;
        } else if (player1Choice.equals(PAPIER) && player2Choice.equals(SPOCK)) {
            return 1;
        } else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(PAPIER)) {
            return 1;
        }else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(JASZCZURKA)) {
            return 1;
        }else if (player1Choice.equals(SPOCK) && player2Choice.equals(NOZYCZKI)) {
            return 1;
        }else if (player1Choice.equals(KAMIEN) && player2Choice.equals(JASZCZURKA)) {
            return 1;
        }else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(SPOCK)) {
            return 1;
        }else if (player1Choice.equals(KAMIEN) && player2Choice.equals(SPOCK)) {
            return 2;
        } else if (player1Choice.equals(SPOCK) && player2Choice.equals(PAPIER)) {
            return 2;
        } else if (player1Choice.equals(PAPIER) && player2Choice.equals(JASZCZURKA)) {
            return 2;
        }else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(NOZYCZKI)) {
            return 2;
        }else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(SPOCK)) {
            return 2;
        }else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(KAMIEN)) {
            return 2;
        }else if (player1Choice.equals(SPOCK) && player2Choice.equals(JASZCZURKA)) {
            return 2;
        }

        return -1;
    }
}