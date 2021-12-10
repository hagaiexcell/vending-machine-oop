import javax.swing.*;

public class Home extends JFrame{
    private JPanel rootHome;
    private JLabel txtAppTitle;
    private JLabel selectLabel;
    private JButton item1Button;
    private JButton item2Button;
    private JButton item3Button;
    private JButton item4Button;
    private JButton item7Button;
    private JButton item8Button;
    private JButton item6Button;
    private JButton item9Button;
    private JButton item5Button;
    private JButton item10Button;
    private JTextField textField1;
    private JButton enterCoinsButton;
    private JButton returnCoinsButton;
    private JButton rp500Button;
    private JButton rp1000Button;
    private JButton rp2000Button;
    private JButton rp5000Button;
    private JButton rp10000Button;
    private JButton rp20000Button;
    private JTextArea outputMessage;
    private JTextField moneyInputTextField;
    private JButton cancelButton;
    private JButton button20;
    private JLabel txtItem1;
    private JLabel txtItem1Price;
    private JLabel txtItem2;
    private JLabel txtItem2Price;
    private JLabel txtItem3;
    private JLabel txtItem3Price;
    private JLabel txtItem4;
    private JLabel txtItem4Price;
    private JLabel txtItem5;
    private JLabel txtItem5Price;
    private JLabel txtItem6;
    private JLabel txtItem6Price;
    private JLabel txtItem7;
    private JLabel txtItem7Price;
    private JLabel txtItem8;
    private JLabel txtItem8Price;
    private JLabel txtItem9;
    private JLabel txtItem9Price;
    private JLabel txtItem10;
    private JLabel txtItem10Price;
    private JLabel selectedItemTotal;
    private JLabel selectedItemTotalLabel;

    public Home(){
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.setContentPane(new Home().rootHome);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.pack();
        home.setSize(1200, 720);
        home.setVisible(true);
        home.setLocationRelativeTo(null);
    }
}
