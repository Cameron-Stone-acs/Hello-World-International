import javax.swing.*;
import java.net.*;
public class Frame extends JFrame
{

    ImageIcon gif = new ImageIcon("stuff/despacito-stevenhe-.gif");
    URL resource = getClass().getResource("path/to/your/animated.gif");
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
        Thread.sleep(11000);
        this.dispose();
    }
}
