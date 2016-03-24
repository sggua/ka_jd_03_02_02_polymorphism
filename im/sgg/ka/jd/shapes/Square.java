package im.sgg.ka.jd.shapes;

import java.awt.*;

/**
 * Created by sergiy on 23.03.16.
 * Java Developer lessons
 * kademika.com
 */
public class Square extends Rectangle {
    private int x, y, size, stroke;
    private Color color;

    public Square() {
        this.x = 230;
        this.y = 30;
        this.size = 140;
        this.stroke = 5;
        this.color=Color.yellow;
    }

    @Override
    public void draw(Graphics g) {
        Rectangle r = new Rectangle(this.x,this.y,this.size,this.size,this.stroke,this.color);
        r.draw(g);
    }
}
