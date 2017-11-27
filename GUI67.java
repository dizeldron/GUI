package Next;
import java.awt.*;
import java.awt.event.*;
import java.security.acl.Group;
import java.util.logging.Handler;
import javax.swing.*;


public class GUI67 extends JFrame{
    private JComboBox box;
    private JLabel picture;
    private static String[] filename = {"aangjpg.jpg", "korra.jpg"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),
            new ImageIcon(getClass().getResource(filename[1]))};

    public GUI67(){
       super("JComboBox");
       setLayout(new FlowLayout());
       box = new JComboBox(filename);
       box.addItemListener(
               new ItemListener() {
                   public void itemStateChanged(ItemEvent event){
                       if(event.getStateChange() == ItemEvent.SELECTED);
                       picture.setIcon(pics[box.getSelectedIndex()]);
                   }
               }
       );
        add(box);
        picture = new JLabel(pics[0]);
        add(picture);


    }
}
