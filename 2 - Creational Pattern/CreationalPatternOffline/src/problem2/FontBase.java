package problem2;

public abstract class FontBase implements Font{
    private String fontName;

    public FontBase(String fontName) {
        this.fontName = fontName;
    }

    @Override
    public String getFontName(){
        return fontName;
    }
}
