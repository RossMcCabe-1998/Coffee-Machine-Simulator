package sounds;

import javax.sound.sampled.*;
import java.io.File;

/**
 * Class responsible for playing sound effects for coffee preparation.
 * @author Ross.
 */
public class SoundPlayer {

    /**
     * Plays sound effect from the provided file path.
     * @param filePath path for the sound file
     */
    public static void playSound(String filePath){

        try {
            File soundFile = new File(filePath);

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e){
            System.out.println("Sound unavailable");
        }
    }
}
