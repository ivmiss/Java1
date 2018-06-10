
package media;

public class Television {
    
    private int volume;
    private int currentProgram = 0;
    private boolean turnOn;
    
    public void Info(){
        System.out.println("Television is turn on: " + this.getTurnOn());
        System.out.println("Current program is: " + this.getCurrentProgram());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("");
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public void setCurrentProgram(int currentProgram){
        this.currentProgram = currentProgram;
    }
    
    public int getCurrentProgram(){
        return this.currentProgram;
    }
    
    public void setTurnOn(boolean turnOn){
        this.turnOn = turnOn;
    }
    
    public boolean getTurnOn(){
        return this.turnOn;
    }
    
}

