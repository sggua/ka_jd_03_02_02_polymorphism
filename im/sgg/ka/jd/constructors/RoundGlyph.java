package im.sgg.ka.jd.constructors;


public class RoundGlyph extends Glyph{
    private int radius = 5;

    public RoundGlyph(int radius) {
        System.out.println("RoundGlyph#Constructor");
        draw();
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("RoundGlyph#draw()");
        System.out.println("RoundGlyph [radius: "+radius+" ]");
    }
}
