import java.util.concurrent.ThreadLocalRandom;

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

                System.out.println("Imiona dzisiejszych graczy to: " + gracz1 + " oraz " + gracz2);

                for (int i = 0; i <= 19; i++) {
                    x = randomStringFromArr();
                    y = randomStringFromArr();
                    int licznik1 = 0;
                    int licznik2 = 0;

                    System.out.println(gracz1 + " wylosował: " + x);
                    System.out.println(gracz2 + " wylosował " + y);

                    if (x == "nożyczki" && y == "nożyczki") {
                        System.out.println("Gra zakończyła się remisem");
                    } else if (x == "nożyczki" && y == "papier") {
                        System.out.println("Wygrał " + gracz1);
                        licznik1++;
                    } else if (x == "nożyczki" && y == "kamień") {
                        System.out.println("Wygrał " + gracz2);
                        licznik2++;
                    } else if (x == "papier" && y == "nożyczki") {
                        System.out.println("Wygrał " + gracz2);
                        licznik2++;
                    } else if (x == "papier" && y == "papier") {
                        System.out.println("Gra zakończyła się remisem");
                    } else if (x == "papier" && y == "kamień") {
                        System.out.println("Wygrał " + gracz1);
                        licznik1++;
                    } else if (x == "kamień" && y == "nożyczki") {
                        System.out.println("Wygrał " + gracz1);
                        licznik1++;
                    } else if (x == "kamień" && y == "papier") {
                        System.out.println("Wygrał " + gracz2);
                        licznik2++;
                    } else if (x == "kamień" && y == "kamień") {
                        System.out.println("Gra zakończyła się remisem");
                    }
                    System.out.println("Gracz " + gracz1 + " wygrał: " + licznik1 + " razy");
                    System.out.println("Gracz " + gracz2 + " wygrał: " + licznik2 + " razy");
                }
            }
        }




    /*
    public static String main(String[] args){
        String[] pkn = new String[3];
        pkn[0] = "papier";
        pkn[1] = "nożyce";
        pkn[2] = "kamień";
        //System.out.println(x);
        Random r = new Random();
        int losowa = r.nextInt(pkn.length);
        return pkn[losowa];

    }

    public static void main(String[] args) {
        String gracz1, gracz2, gracz1Wybor, gracz2Wybor;
        gracz1 = "Robert";
        gracz2 = "Mateusz";
        System.out.println("Imiona graczy to: " + gracz1 + " oraz " + gracz2);


        System.out.println("Gracz " + gracz1 + " wylosował " + losowa);
    }
}
     */

