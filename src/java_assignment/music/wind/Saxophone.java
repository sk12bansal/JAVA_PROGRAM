package java_assignment.music.wind;

import java_assignment.music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("play called from Saxophone");
    }
}
