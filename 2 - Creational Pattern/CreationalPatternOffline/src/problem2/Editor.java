package problem2;

public class Editor{
    private static Editor instance = null;
    private Environment currEnv;

    EnvFactory envFactory = new EnvFactory();

    private Editor(String envName){
        currEnv = envFactory.getEnvironment(envName);
    }

    public static Editor getInstance(String envName){
        if (instance == null){
            instance = new Editor(envName);
        }
        return instance;
    }

    public void showEnv(){
        System.out.println("Font set to: " + currEnv.getFontName());
        currEnv.parseCode();
    }
}
