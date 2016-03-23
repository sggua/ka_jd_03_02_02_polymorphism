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
        int x=420, y=250, size=140, stroke=5;

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke((float) 5));
        g2.setColor(Color.blue);
        g2.drawPolygon(new int[]{x,x+size/2,x+size},new int[]{y,y-size,y},3);
        g2.fillPolygon(
                new int[]{x+(int)(stroke*3.5),x+size/2,x+size-(int)(stroke*3.5)},
                new int[]{y-stroke*2,y-size+stroke*5,y-stroke*2},3
        );

    }
}
