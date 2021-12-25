

package caro;

// import sun.audio.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

/**
 *
 * @author 
 */
public class SoundPlayer {
    private FileInputStream FIS  ; 
    private Player myPlayer ; 
  
  
    public void playSound(String path ) { 
        // File soundFile = new File(path);
        try {            
                  
              FIS = new FileInputStream(path) ; 
                  
              myPlayer = new Player(FIS) ; 
              /* AudioInputStream sampleStream = AudioSystem.getAudioInputStream(soundFile);
 
              AudioFormat formatAudio = sampleStream.getFormat();
   
              DataLine.Info info = new DataLine.Info(SourceDataLine.class, formatAudio);
   
              SourceDataLine theAudioLine = (SourceDataLine) AudioSystem.getLine(info);
   
              theAudioLine.open(formatAudio); */
             /*  InputStream in = new FileInputStream(path);

              // create an audiostream from the inputstream
              AudioInputStream audioStream = new AudioInputStream(in);
          
              // play the audio clip with the audioplayer class
              AudioPlayer.player.start(audioStream);
 */
           
               new Thread (
                    new Runnable() {

                @Override
                public void run() {
                        try { 
                         myPlayer.play(); 
                        // theAudioLine.start();
                                              
                    }catch(Exception e) { 
                    }                                                                              
                }
            }
            ).start();  ; 
           
 
            
             
        }
        catch(Exception e ) { 
            System.out.println("Error from soundPlayer");
    }
        
    }
 
   
}
