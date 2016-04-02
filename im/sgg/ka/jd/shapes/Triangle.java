package im.sgg.ka.jd.shapes;

import java.awt.*;

public class Triangle extends AbstractShape {

    public Triangle() {
        this(420,250,140,5,Color.blue);
    }

    public Triangle(int x, int y, int size, int stroke, Color color) {
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
        g2.setStroke(new BasicStroke((float) 5));
        g2.setColor(this.getColor());
        g2.drawPolygon(
                new int[]{this.x,this.x+this.size/2,this.x+this.size},
                new int[]{this.y,this.y-this.size,this.y},3
        );
        g2.fillPolygon(
                new int[]{this.x+(int)(this.stroke*3.5),this.x+this.size/2,this.x+this.size-(int)(this.stroke*3.5)},
                new int[]{this.y-this.stroke*2,this.y-this.size+this.stroke*5,this.y-this.stroke*2},3
        );

    }
}
