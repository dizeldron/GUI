package Next;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI76 extends JFrame {

    private String Details;
    private JLabel statusbar;

    public GUI76(){
        super("Adapter Class");
        statusbar = new JLabel("Stroka sostoianiia");
        add(statusbar, BorderLayout.SOUTH);

        addMouseListener(new MouseClass());
            }
            private class MouseClass extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            Details = String.format("You've cliked %d times",event.getClickCount());
            if(event.isMetaDown())
                Details+=" the right mousebutton...";
                else if (event.isAltDown())
                    Details+=" the central mousebutton...";
            else
                Details+=" the left mousebutton...";
            statusbar.setText(Details);

        }
        }

    }

