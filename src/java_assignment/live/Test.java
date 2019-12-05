package java_assignment.live;

import java_assignment.music.Playable;
import java_assignment.music.string.Veena;
import java_assignment.music.wind.Saxophone;

public class Test {
    public static void main(String args[]){
        Veena veena = new Veena();
        veena.play();
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable playable1 = veena;
        playable1.play();

        Playable playable2 = saxophone;
        playable2.play();
    }
}
