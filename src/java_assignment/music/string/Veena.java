package java_assignment.music.string;

import java_assignment.music.Playable;

public class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("play called from veena");
    }
}
