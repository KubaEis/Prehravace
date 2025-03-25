import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean smicka = true;
        IPrehravac[] prehravace;
        System.out.println("Kolik chcete pridat prehravacu?");
        int pocet = sc.nextInt();
        sc.nextLine();
        prehravace = new IPrehravac[pocet];
        for (int i = 0; i < pocet; i++) {
            System.out.println("pridavate "+(i+1)+" prehravac stisknete:");
            System.out.println("1. pokud je to MP3");
            System.out.println("2. pokud je to smartphone");
            System.out.println("3. pokud je to radio");
            int typ = sc.nextInt();
            sc.nextLine();
            if (typ < 1 || typ > 3) {
                System.err.println("Spatne zadano, oopravte se");
                i--;
            }
            switch (typ) {
                case 1 -> {
                    System.out.println("Zadej znacku MP3:");
                    String znacka = sc.nextLine();
                    MP3 mp3 = new MP3(znacka);
                    prehravace[i] = mp3;
                }
                case 2 -> {
                    System.out.println("Zadej znacku smartphonu:");
                    String znacka = sc.nextLine();
                    Smartphone smartphone = new Smartphone(znacka);
                    prehravace[i] = smartphone;
                }
                case 3 -> {
                    Radio radio = new Radio();
                    prehravace[i] = radio;
                }
            }
        }
        while (smicka){
            System.out.println("Výtej v menu");
            System.out.println("Stiskni:");
            System.out.println("1. pokud chceš vypsat zařízení");
            System.out.println("2. pokud chceš přehrát něco ze zařízení");
            System.out.println("3. pokud chceš zastavit přehrávání ze zařízení");
            System.out.println("4. pokud chceš přehrát danou písničku");
            int volba = sc.nextInt();
            sc.nextLine();

            switch (volba) {
                case 1 -> {
                    for (int i = 0; i < prehravace.length; i++) {
                        System.out.println(prehravace[i].toString());
                    }
                }
                case 2 -> {
                    System.out.println("Zadejte index přehrávače:");
                    int index = sc.nextInt();
                    if (index < prehravace.length || index > prehravace.length) {
                        System.err.println("Spatne zadano, oopravte se");
                        break;
                    }
                    sc.nextLine();
                    prehravace[index].prehraj(true);
                }
                case 3 -> {
                    System.out.println("Zadejte index přehrávače:");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index < prehravace.length || index > prehravace.length) {
                        System.err.println("Spatne zadano, oopravte se");
                        break;
                    }
                    prehravace[index].prehraj(false);
                }
                case 4 -> {
                    System.out.println("Zadejte index přehrávače:");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index < prehravace.length || index > prehravace.length) {
                        System.err.println("Spatne zadano, oopravte se");
                        break;
                    }
                    System.out.println("Jakou chceš přehrát písničku?");
                    String pisnicka = sc.nextLine();
                    prehravace[index].prehraj(pisnicka);
                }
            }

        }
    }

}