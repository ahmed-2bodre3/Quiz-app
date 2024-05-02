
package quiz.app;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class QuizApp {
   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz-App");
        ImageIcon background_image =new ImageIcon("D:\\projects\\java\\Quiz-app\\src\\image\\background.png");
        Image img = background_image.getImage();
        Image temp_img=img.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel label = new JLabel(background_image);
        frame.add(label);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
