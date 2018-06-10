package main;
       
import media.Television;

import media.Radio;

public class Main {

   
    public static void main(String[] args) {
       Television newTel = new Television();
       newTel.setTurnOn(true);
       newTel.setCurrentProgram(4);
       newTel.setVolume(15);
       newTel.Info();
       
       Radio newRad = new Radio();
       newRad.setFmFrequency(91.8);
       newRad.setAmFrequency(600);
       newRad.setBand('F');
       newRad.Info();
    }
    
}
