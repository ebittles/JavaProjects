import javax.swing.JFrame;
import javax.swing.*;

public class BrickBreaker {
    public static void main(String[] args) {
        JFrame f = new JFrame();        

        GamePlay gameplay = new GamePlay();
        f.setBounds(10,10,700,600);
        f.setTitle("BrickBreaker");
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(gameplay);
    }
    
}