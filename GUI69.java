package Next;
import java.awt.*;
import java.awt.event.*;
import java.security.acl.Group;
import java.util.logging.Handler;
import javax.swing.*;
import javax.swing.event.*;

public class GUI69 extends JFrame {
    private JList list;
    private static String[] colorNames = {"white", "blue","green","red"};
    private static Color[] colors = {Color.WHITE, Color.BLUE, Color.GREEN, Color.RED};

    public GUI69(){
        super("Lesson69 JList");
        setLayout(new FlowLayout());

        list = new JList(colorNames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(list);
        list.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                    }
                }

        );
    }

}
