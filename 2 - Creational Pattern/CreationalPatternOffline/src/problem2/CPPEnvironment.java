package problem2;

public class CPPEnvironment extends Environment{
    private FontBase fontBase;
    private Parser parser;

    public CPPEnvironment() {
        setFont();
        setParser();
    }
    @Override
    public void setFont() {
       fontBase = fontFactory.getFont("Monaco");
    }

    @Override
    public void setParser() {
        parser = parserFactory.getParser("CPP");
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
