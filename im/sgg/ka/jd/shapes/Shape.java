package im.sgg.ka.jd.shapes;

import java.awt.*;

/**
 * Created by sergiy on 23.03.16.
 * Java Developer lessons
 * kademika.com
 */
public class Shape {
    public void draw(Graphics g){
        throw new IllegalStateException("Please, choose the correct class to draw. " +
                "I can't draw just a \"Shape\".");
    }
}
