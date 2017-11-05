package NextLevel;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lesson23_Window extends JFrame{
    private JSlider slider;

    private Lesson23_KrugSlider myPanel;

    Lesson23_Window(){
        super("Slider!!!");
        myPanel = new Lesson23_KrugSlider();
        myPanel.setBackground(Color.GREEN);
        slider = new JSlider(SwingConstants.HORIZONTAL,0,340,10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setDiametr(slider.getValue());

                    }
                }
        );

        add(slider,BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}