public class Smartphone implements IPrehravac{
    private String model;
    public Smartphone(String znacka){
        this.model = znacka;
    }
    public void prehraj(boolean hraj){
        if (true){
            System.out.println("Prehravani MP3 prehravace znacky"+ model +" spusteno ");
        }else{
            System.out.println("Prehravani MP3 prehravace znacky"+ model +" vypnoto ");
        }
    }
}
