package im.sgg.ka.jd;

import im.sgg.ka.jd.shapes.*;
import im.sgg.ka.jd.shapes.Rectangle;
import im.sgg.ka.jd.shapes.Shape;

import java.awt.*;

public class _Launcher {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();


        ShapesTemplate s = new ShapesTemplate(shapes);
        

    }

//    static void artist(Shape shape){
//        shape.draw(new Graphics);
//    }

}
