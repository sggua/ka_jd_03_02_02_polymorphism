package im.sgg.ka.jd.shapes;

import java.awt.*;

public class Square extends Rectangle {

    public Square() {
        this(230,30,140,5,Color.yellow);
    }

    public Square(int x, int y, int size, int stroke, Color color) {
        super(x, y, size, size, stroke, color);
    }

}
