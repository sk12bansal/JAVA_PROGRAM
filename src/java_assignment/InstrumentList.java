package java_assignment;

import java.util.Random;

abstract class Instrument{
    abstract void play();
}
class Piano extends Instrument{
    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan tan ");
    }
}
class Flute extends Instrument{
    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument{
    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
public class InstrumentList {
    public static void main(String args[]){
        Instrument [] instruments = new Instrument[10];
        Random rand = new Random();
        for(int i=0;i<10;i++){
            int random = rand.nextInt(3);
            switch (random) {
                case 0:
                    instruments[i] = new Piano();
                    break;
                case 1:
                    instruments[i] = new Flute();
                    break;
                case 2:
                    instruments[i] = new Guitar();
                    break;
            }
        }
        for(Instrument instrument:instruments){
            instrument.play();
        }
    }
}
