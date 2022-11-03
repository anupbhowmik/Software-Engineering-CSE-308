package problem2;

public class PyEnvironment extends Environment{
    private FontBase fontBase;
    private Parser parser;

    public PyEnvironment() {
        setFont();
        setParser();
    }
    @Override
    public void setFont() {
       fontBase = fontFactory.getFont("Consolas");
    }

    @Override
    public void setParser() {
        parser = parserFactory.getParser("Python");
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
