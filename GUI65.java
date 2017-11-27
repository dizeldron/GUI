package Next;
import java.awt.*;
import java.awt.event.*;
import java.security.acl.Group;
import java.util.logging.Handler;
import javax.swing.*;


public class GUI65 extends JFrame{
    private JTextField TF;
    private Font PF;
    private Font BF;
    private Font ITF;
    private Font BIF;
    private JRadioButton TB;
    private JRadioButton BB;
    private JRadioButton IB;
    private JRadioButton BIB;
    private ButtonGroup group;

    public GUI65(){
        super("Lesson ^65^");
       setLayout(new FlowLayout());
       TF = new JTextField("Rise up high!!!",20);
       add(TF);
       TB = new JRadioButton("Additional", true);
       BB = new JRadioButton("FAT", false);
       IB = new JRadioButton("Italy", false);
       BIB = new JRadioButton("FAT&I", false);
       add(TB);
       add(BB);
       add(IB);
       add(BIB);
       group = new ButtonGroup();
       group.add(TB);
       group.add(BB);
       group.add(IB);
       group.add(BIB);

       PF = new Font("Serif",Font.PLAIN, 14);
       BF = new Font("Serif",Font.BOLD, 14);
       ITF = new Font("Serif",Font.ITALIC, 14);
       BIF = new Font("Serif",Font.BOLD + Font.ITALIC, 14);
       TF.setFont(PF);
       TB.addItemListener(new HandlerClass(PF));
       BB.addItemListener(new HandlerClass(BF));
       IB.addItemListener(new HandlerClass(ITF));
       BIB.addItemListener(new HandlerClass(BIF));
    }

    private class HandlerClass implements ItemListener{
        private Font font;

        public HandlerClass(Font f){
            font = f;
        }
        public void itemStateChanged(ItemEvent event){
            TF.setFont(font);

        }

    }
}
