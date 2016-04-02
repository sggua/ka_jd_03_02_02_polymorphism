package im.sgg.ka.jd.shapes;

import java.awt.*;

public class Circle extends AbstractShape {

    public Circle() {
        this(30,110,140,5,Color.red);
    }

    public Circle(int x, int y, int size, int stroke, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.stroke = stroke;
        this.color = color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void draw(Graphics g){

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke((float) stroke));
        g2.setColor(this.getColor());
        g2.drawOval(this.x,this.y,this.size,this.size);
        g2.fillOval(this.x+this.stroke*2,    this.y+this.stroke*2,
                    this.size-this.stroke*4, this.size-this.stroke*4);

    }

}
