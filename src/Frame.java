import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.net.*;
public class Frame extends JFrame
{
    ImageIcon gif = new ImageIcon("stuff/despacito-stevenhe-.gif");
    AudioInputStream audio;
    Clip clip;
    Frame() throws InterruptedException {
        JButton button = new JButton("Please put");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(220, 159);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        JLabel label = new JLabel(gif);
        this.getContentPane().add(label);
        try
        {
            audio = AudioSystem.getAudioInputStream(new File("stuff/despacito.wav"));
            clip = (Clip) AudioSystem.getLine(new DataLine.Info(Clip.class, audio.getFormat()));
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        Thread.sleep(11000);
        this.dispose();
    }

}
