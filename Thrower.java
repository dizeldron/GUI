package NextLevel;
import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class Thrower extends JFrame{

    private JTextField addressBar;
    private JEditorPane browserPage;

    public Thrower(){
        super(" SuperBrowser ");
        addressBar = new JTextField(" Say the way: ");

        addressBar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        loadData(e.getActionCommand( ));
                    }
                }
        );

        add(addressBar, BorderLayout.NORTH);
        browserPage = new JEditorPane();
        browserPage.setEditable(false);

        browserPage.addHyperlinkListener(
                new HyperlinkListener() {
                    @Override
                    public void hyperlinkUpdate(HyperlinkEvent e) {
                        if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
                            loadData(e.getURL().toString());
                        }

                    }
                }
        );
        add(new JScrollPane(browserPage), BorderLayout.CENTER );
        setSize(640,480);
        setVisible(true);

    }

    private void loadData(String userText){
        try{
            browserPage.setText(userText);
            addressBar.setText(userText);

        }
            catch(Exception e){
            browserPage.setText( " With the site\n " + "\t" + userText + "\n is something wrong. ");

            }
    }
}
