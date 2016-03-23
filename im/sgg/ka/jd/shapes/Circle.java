package im.sgg.ka.jd.shapes;

import java.awt.*;

/**
 * Created by sergiy on 23.03.16.
 * Java Developer lessons
 * kademika.com
 */
public class Circle extends Shape {

    @Override
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke((float) 5));
        g2.setColor(Color.red);
        g2.drawOval(80,130,140,140);
        g2.fillOval(90,140,120,120);

    }

}
