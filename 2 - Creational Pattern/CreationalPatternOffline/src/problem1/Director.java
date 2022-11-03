package problem1;

public class Director {
    iBuilder currBuilder;

    public void buildSetup(iBuilder builder){
        currBuilder = builder;
        currBuilder.buildProcessor();
        currBuilder.buildDisplay();
        currBuilder.buildApp();
        currBuilder.buildComChannel();
    }
}
