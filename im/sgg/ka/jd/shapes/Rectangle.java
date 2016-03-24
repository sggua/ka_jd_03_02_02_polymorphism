package im.sgg.ka.jd.shapes;

import java.awt.*;

/**
 * Created by sergiy on 23.03.16.
 * Java Developer lessons
 * kademika.com
 */
public class Rectangle extends Shape {
    private int x, y, sizeX, sizeY,  stroke;
    private Color color=Color.green;

    public Rectangle() {
        this.x = 210;
        this.y = 195;
        this.sizeX = 180;
        this.sizeY = 140;
        this.stroke = 5;
        this.color = Color.green;
    }

    protected Rectangle(int x, int y, int sizeX, int sizeY, int stroke, Color color) {
        this.x = x;
        this.y = y;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.stroke = stroke;
        this.color = color;
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
