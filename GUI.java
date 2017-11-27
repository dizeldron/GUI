package Next;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GUI extends JFrame {
    private JButton RegBut;
    private JButton CusBut;

    public GUI(){
        super("Zagolovok okna!!!");
        setLayout(new FlowLayout());

        RegBut = new JButton("Just a button");
        add(RegBut);

        Icon Fry = new ImageIcon(getClass().getResource("Fry.jpg"));
        Icon Bart = new ImageIcon(getClass().getResource("BartJPG.jpg"));

        CusBut = new JButton("Pretty button", Fry);
        CusBut.setRolloverIcon(Bart);
        add(CusBut);

        ClassObrabotka obrabotka = new ClassObrabotka();

        RegBut.addActionListener(obrabotka);
        CusBut.addActionListener(obrabotka);
    }
    private class ClassObrabotka implements ActionListener{

        public void actionPerformed(ActionEvent event){

            JOptionPane.showMessageDialog(null, String.format("%s",
                    event.getActionCommand()));
        }
    }
}
