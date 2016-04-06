package im.sgg.ka.jd.shapes;

import java.awt.*;

public abstract class AbstractShape implements Drawble{
    protected int x,y,size,sizeX,sizeY,stroke;
    protected Color color;

//    @Override
//    public abstract void draw(Graphics g);

    public abstract Color getColor();
    public abstract void setColor(Color color);
}
