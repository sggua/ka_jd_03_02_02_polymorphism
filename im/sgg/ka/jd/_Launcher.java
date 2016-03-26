package im.sgg.ka.jd;

import im.sgg.ka.jd.constructors.Glyph;
import im.sgg.ka.jd.constructors.GlyphNpe;
import im.sgg.ka.jd.constructors.RoundGlyph;
import im.sgg.ka.jd.shapes.*;

public class _Launcher {

    public static void main(String[] args) {

//        Shape[] shapes = new Shape[4];
//        shapes[0] = new Circle();
//        shapes[1] = new Rectangle();
//        shapes[2] = new Triangle();
//        shapes[3] = new Square();
//
//
//        new ShapesTemplate(shapes);

        Glyph glyph = new RoundGlyph(10);
        glyph.draw();

        Glyph glyph2 = new GlyphNpe();
        glyph.draw(111);

    }
}
