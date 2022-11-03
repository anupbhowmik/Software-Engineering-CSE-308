package problem2;

public class CEnvironment extends Environment{
    private FontBase fontBase;
    private Parser parser;

    public CEnvironment() {
        setFont();
        setParser();
    }

    @Override
    public void setFont() {
       fontBase = fontFactory.getFont("CourierNew");
    }

    @Override
    public void setParser() {
        parser = parserFactory.getParser("C");
    }

    @Override
    public String getFontName() {
        return fontBase.getFontName();
    }

    @Override
    public void parseCode() {
        parser.parseCode();
    }

}
