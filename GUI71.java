package Next;
import java.awt.*;
import java.awt.event.*;
import java.security.acl.Group;
import java.util.Random;
import java.util.logging.Handler;
import javax.swing.*;
import javax.swing.event.*;

public class GUI71 extends JFrame {
    private JList Left;
    private JList Right;
    private JButton Move;

    public static String []heroes =  {"Fry","Bender","Leela","Homer","Rick","Bob"};

    public GUI71(){
        super("71 <> JList");
        setLayout(new FlowLayout());

        Left = new JList(heroes);
        Left.setVisibleRowCount(3);
        Left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(Left));

        Move = new JButton("Move That Way==> ");
        Move.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Right.setListData(Left.getSelectedValues());

                    }
                }
        );
        add(Move);
        Right = new JList(heroes);
        Right.setVisibleRowCount(3);
        Right.setFixedCellHeight(15);
        Right.setFixedCellWidth(100);
        Right.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(Right));
    }
}
