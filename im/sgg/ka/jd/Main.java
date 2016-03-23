package im.sgg.ka.jd;

import im.sgg.ka.jd.shapes.Circle;
import im.sgg.ka.jd.shapes.Rectangle;
import im.sgg.ka.jd.shapes.Shape;
import im.sgg.ka.jd.shapes.Triangle;

public class Main {

    public static void main(String[] args) {

        artist(new Circle());
        artist(new Rectangle());
        artist(new Triangle());
        artist(new Shape());


    }

    static void artist(Shape shape){
        shape.draw();
    }
}
