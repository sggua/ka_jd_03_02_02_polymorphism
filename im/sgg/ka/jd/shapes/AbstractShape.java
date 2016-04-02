package im.sgg.ka.jd.shapes;

import java.awt.*;

/**
 * Created by sergiy on 23.03.16.
 * Java Developer lessons
 * kademika.com
 */
public abstract class AbstractShape {
    protected int x,y,size,sizeX,sizeY,stroke;
    protected Color color;
    public abstract void draw(Graphics g);

    public abstract Color getColor();
    public abstract void setColor(Color color);
}
