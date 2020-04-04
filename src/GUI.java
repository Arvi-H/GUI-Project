import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener{

    private JFrame frame;
    private JPanel panel;
    private JPanel panel2;
    private JLabel labelIcon;
    private JLabel label;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton button;
    private JLabel label2;

    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        panel.setLayout(null);
        label = new JLabel();
        label.setText("Username");
        label.setFont(new Font("Arial", Font.BOLD, 13));
        label.setBounds(10,20, 80, 25);
        panel.add(label);
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        label2 = new JLabel("Password");
        label2.setFont(new Font("Arial", Font.BOLD, 13));
        label2.setBounds(10,50, 80, 25);
        panel.add(label2);
        passwordText= new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Log in");
        button.setFont(new Font("Arial", Font.PLAIN, 11));
        button.setBounds(200, 80, 65 ,20);
        button.addActionListener(this::actionPerformed);
        panel.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    public void dialogBox(){
          ImageIcon img = new ImageIcon("wallpaper3.jpg");
          JOptionPane.showMessageDialog(null, "",
          "--------------------- INCORRECT PASSWORD ---------------------", JOptionPane.INFORMATION_MESSAGE, img);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         dialogBox();
    }

}