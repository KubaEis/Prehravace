public class Smartphone implements IPrehravac{
    private String model;
    public Smartphone(String znacka){
        this.model = znacka;
    }
    public void prehraj(boolean hraj){
        if (true){
            System.out.println("Prehravani Smartphone prehravace znacky "+ model +" spusteno ");
        }else{
            System.out.println("Prehravani Smartphone prehravace znacky "+ model +" vypnoto ");
        }
    }
    public String toString(){
        return "Smartphone "+model;
    }
}
