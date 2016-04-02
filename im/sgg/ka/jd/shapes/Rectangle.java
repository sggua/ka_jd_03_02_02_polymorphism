package im.sgg.ka.jd.shapes;

import java.awt.*;

public class Rectangle extends AbstractShape {

    public Rectangle() {
        this(210, 195, 180, 140, 5, Color.green);
    }

    public Rectangle(int x, int y, int sizeX, int sizeY, int stroke, Color color) {
        this.x = x;
        this.y = y;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
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
        g2.setStroke(new BasicStroke((float) this.stroke));
        g2.setColor(this.color);
        //g2.drawRect(x,y,sizeX,sizeY);
        //g2.fillRect(x+stroke*2,y+stroke*2,sizeX-stroke*4,sizeY-stroke*4);

        g2.drawPolygon(
                new int[]{this.x,this.x,this.x+this.sizeX,this.x+this.sizeX},
                new int[]{this.y,this.y+this.sizeY,this.y+this.sizeY,this.y},4
        );
        g2.fillPolygon(
                new int[]{this.x+this.stroke*2,this.x+this.stroke*2,
                        this.x-this.stroke*2+this.sizeX,this.x-this.stroke*2+this.sizeX},
                new int[]{this.y+this.stroke*2,this.y-this.stroke*2+this.sizeY,
                        this.y-this.stroke*2+this.sizeY,this.y+this.stroke*2},4
        );

    }
}
