package problem2;

public class FontFactory {

    FontBase getFont(String fontName) {
        if (fontName.equalsIgnoreCase("Consolas"))
            return new Consolas();
        if (fontName.equalsIgnoreCase("Monaco"))
            return new Monaco();
        if (fontName.equalsIgnoreCase("CourierNew")){
            return new CourierNew();
        }

        return null;
    }

}
