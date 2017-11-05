package NextLevel;
import javax.swing.*;
import java.awt.*;

public class Lesson23_KrugSlider extends JPanel{

    private int diametr = 10;

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.fillOval(10,14,diametr,diametr);

    }
    public void setDiametr(int newDiametr){
        diametr = (newDiametr >=0 ? newDiametr : 10);
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension (400, 400);
    }

    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}
