package Next;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI63 extends JFrame{
    private JTextField TextField;
    private JCheckBox holdBox;
    private JCheckBox italicBox;

    GUI63(){
        super("Lesson 63 CheckBox!!!");
        setLayout(new FlowLayout());

        TextField = new JTextField("Lesson 63",20);
        TextField.setFont(new Font("serif", Font.PLAIN,14));
        holdBox = new JCheckBox("FAT");
        italicBox = new JCheckBox("OTHER ONE");
        add(TextField);
        add(holdBox);
        add(italicBox);

        HandlerClass obrabotka = new HandlerClass();

        holdBox.addItemListener(obrabotka);
        italicBox.addItemListener(obrabotka);
    }

    private class HandlerClass implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            Font font = null;
            if (holdBox.isSelected() && italicBox.isSelected()) {
                font = new Font("serif", Font.BOLD + Font.ITALIC, 14);
            }
             else  if  (holdBox.isSelected())
                    font = new Font("serif", Font.BOLD, 14);
                else  if (italicBox.isSelected())
                        font = new Font("serif", Font.ITALIC, 14);
                        TextField.setFont(font);
                    }
                }
            }

