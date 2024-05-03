
package quiz.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class QuizApp {
   
    public static void main(String[] args) {
        
        
        
        //panal
        
        JPanel loginAndRegister = new JPanel();
        JButton login = new JButton("Login");
        JButton register = new JButton("Register");
        loginAndRegister.add(login);
        loginAndRegister.add(register);
        loginAndRegister.setBounds(1500, 0, 200, 50);
        loginAndRegister.setBackground(new Color(255, 0, 255, 0));
        loginAndRegister.setBorder(new LineBorder(Color.BLACK,2));
        
        
       login.setFont(new Font("Arial", Font.BOLD, 16));
        login.setForeground(Color.WHITE);

        // Set custom background color
        login.setBackground(new Color(153, 0, 153,50));

        // Add hover effect
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login.setBackground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                login.setBackground(new Color(153, 0, 153,50));
            }
        });

       register.setFont(new Font("Arial", Font.BOLD, 16));
        register.setForeground(Color.WHITE);

        // Set custom background color
        register.setBackground(new Color(153, 0, 153,50));

        // Add hover effect
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register.setBackground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                register.setBackground(new Color(153, 0, 153,50));
            }
        });
       
        
        
        
        
        
        
        //frame
        
        
        JFrame frame = new JFrame("Quiz-App");
        ImageIcon background_image =new ImageIcon("D:\\projects\\java\\Quiz-app\\src\\image\\background.png");
        Image img = background_image.getImage();
        Image temp_img=img.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel label = new JLabel(background_image);
        frame.setBounds(0, 0, 1920, 1080);
        
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
        //add the component
        
        frame.add(loginAndRegister);
        
        frame.add(label );
    }
}
