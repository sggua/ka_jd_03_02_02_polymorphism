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
        int x=30, y=110, size=140, stroke=5;

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke((float) stroke));
        g2.setColor(Color.red);
        g2.drawOval(x,y,size,size);
        g2.fillOval(x+stroke*2,y+stroke*2,size-stroke*4,size-stroke*4);

    }

}
