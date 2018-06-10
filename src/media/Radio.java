
package media;

public class Radio {
    
    private double fmFrequency;
    private int amFrequency;
    private char band;
    
//    public Radio(){
//        this.fmFrequency = 91.8;
//        this.amFrequency = 600;
//        this.band = 'F';
//    }
    
    public void Info(){
        System.out.println("FM: " + this.getFmFrequency());
        System.out.println("AM: " + this.getAmFrequency());
        System.out.println("Frequency band: " + this.getBand());
    }
    
    public void setFmFrequency(double fmFrequency){
        this.fmFrequency = fmFrequency;
    }
    
    public double getFmFrequency(){
        return this.fmFrequency;
    }
    
    public void setAmFrequency(int amFrequency){
        this.amFrequency = amFrequency;
    }
    
    public int getAmFrequency(){
        return this.amFrequency;
    }
    
    public void setBand(char band){
        this.band = band;
    }
    
    public char getBand(){
        return this.band;
    }
    
}
