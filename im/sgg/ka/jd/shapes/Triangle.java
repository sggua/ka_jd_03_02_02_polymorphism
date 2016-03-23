package im.sgg.ka.jd.shapes;

import java.awt.*;

/**
 * Created by sergiy on 23.03.16.
 * Java Developer lessons
 * kademika.com
 */
public class Triangle extends Shape {

    @Override
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke((float) 5));
        g2.setColor(Color.blue);
        g2.drawPolygon(new int[]{380,450,520},new int[]{270,130,270},3);
        g2.fillPolygon(new int[]{397,450,503},new int[]{260,155,260},3);

    }
}
