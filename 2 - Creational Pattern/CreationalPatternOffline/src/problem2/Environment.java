package problem2;


public abstract class Environment {

   protected FontFactory fontFactory = new FontFactory();
   protected ParserFactory parserFactory = new ParserFactory();
    abstract void setFont();

    abstract void setParser();

    abstract String getFontName();

    abstract void parseCode();
}
