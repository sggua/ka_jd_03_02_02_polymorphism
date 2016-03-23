package im.sgg.ka.jd.shapes;

import java.awt.*;

/**
 * Created by sergiy on 23.03.16.
 * Java Developer lessons
 * kademika.com
 */
public class Rectangle extends Shape {

    @Override
    public void draw(Graphics g){
        int x=210, y=195;
        int sizeX=180, sizeY=140;
        int stroke=5;

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke((float) stroke));
        g2.setColor(Color.green);
        g2.drawRect(x,y,sizeX,sizeY);
        g2.fillRect(x+stroke*2,y+stroke*2,sizeX-stroke*4,sizeY-stroke*4);
    }
}
