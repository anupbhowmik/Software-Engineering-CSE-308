package problem2;

public class EnvFactory {

    Environment getEnvironment(String envName) {
        if (envName.equalsIgnoreCase("C"))
            return new CEnvironment();
        if (envName.equalsIgnoreCase("CPP"))
            return new CPPEnvironment();
        if (envName.equalsIgnoreCase("Python"))
            return new PyEnvironment();
        return null;
    }
}
