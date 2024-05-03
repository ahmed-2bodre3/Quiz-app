package quiz.app;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class login extends JPanel{

    public login() {
        
        //add image
        
        ImageIcon login_image = new ImageIcon("D:\\projects\\java\\Quiz-app\\src\\image\\login.jpg");
        Image img = login_image.getImage();
        Image temp_img = img.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
        login_image = new ImageIcon(temp_img);
        JLabel label=new JLabel(login_image);
        
        setLayout(new BorderLayout());
        
        //add text fild
        
        JPanel p_logFild = new JPanel();
        
        p_logFild.setLayout(new BorderLayout());
        //add login label
        JLabel l_log =new JLabel("LOG IN");
        p_logFild.add(l_log,BorderLayout.NORTH);
        
        
        l_log.setHorizontalAlignment(SwingConstants.CENTER);
        
        l_log.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(50,0,0,0),l_log.getBorder()));
        l_log.setFont(new Font("Arial", Font.PLAIN, 20));
        

        //add button
        JButton btn = new JButton("Log In");
        p_logFild.add(btn,BorderLayout.SOUTH);
        
       p_logFild.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0,20,50,20),p_logFild.getBorder()));
       
       
  
       
       JPanel center_filed = new JPanel();
       
       center_filed.setLayout(new GridLayout(2,2));
       
       JLabel l_user = new JLabel("Enter Your User Name : ");
       
       center_filed.add(l_user);
       
       JTextField t_user = new JTextField();
       
       center_filed.add(t_user);
       
       JLabel l_password = new JLabel("Enter Your Password : ");
       
       center_filed.add(l_password);
       
       JPasswordField p_filed = new JPasswordField();
       
       center_filed.add(p_filed);
       
       
       p_logFild.add(center_filed,BorderLayout.CENTER);
       
       center_filed.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(100,10,100,10),p_logFild.getBorder()));
       

        
        add(label,BorderLayout.WEST);
        add(p_logFild,BorderLayout.CENTER);
    }
}
