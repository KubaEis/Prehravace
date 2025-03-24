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
        if (smicka){

        }
    }

}