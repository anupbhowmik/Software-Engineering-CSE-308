package problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter file name:");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        String extensionC = "";
        String extensionCpp = "";
        String extensionPy = "";

        if(fileName.length() < 3){
            System.out.println("invalid file name");
            return;
        }

        if(fileName.length() >= 3)
            extensionC = fileName.substring(fileName.length() - 2);
        if(fileName.length() >= 5)
            extensionCpp = fileName.substring(fileName.length() - 4);
        if(fileName.length() >= 4)
            extensionPy = fileName.substring(fileName.length() - 3);


        if (extensionCpp.equalsIgnoreCase(".cpp")){
            Editor editor = Editor.getInstance("CPP");
            editor.showEnv();

        }
        if (extensionC.equalsIgnoreCase(".c")){
            Editor editor = Editor.getInstance("C");
            editor.showEnv();

        }
        if (extensionPy.equalsIgnoreCase(".py")){
            Editor editor = Editor.getInstance("Python");
            editor.showEnv();

        }



    }
}
