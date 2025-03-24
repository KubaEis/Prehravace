public class MP3 implements IPrehravac{
    private String znacka;
    public MP3(String znacka){
        this.znacka = znacka;
    }
    public void prehraj(boolean hraj){
        if (true){
            System.out.println("Prehravani MP3 prehravace znacky"+znacka+" spusteno ");
        }else{
            System.out.println("Prehravani MP3 prehravace znacky"+znacka+" vypnoto ");
        }
    }

}
