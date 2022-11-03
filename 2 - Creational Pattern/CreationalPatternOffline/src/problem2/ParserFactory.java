package problem2;

public class ParserFactory{
    Parser getParser(String parserName) {
        if (parserName.equalsIgnoreCase("C"))
            return new CParser();
        if (parserName.equalsIgnoreCase("CPP"))
            return new CPPParser();
        if (parserName.equalsIgnoreCase("Python"))
            return new PyParser();
        return null;
    }
}
