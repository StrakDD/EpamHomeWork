package ua.epam.task04.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class View {
    public static ResourceBundle bundle = ResourceBundle.getBundle("Russian", new Locale("ru_RU"));

    public void printMessage(String message){
        System.out.print(message);
    }

    public void printlnMessage(String message){
        System.out.println(message);
    }

    public void printMessage(String...messages){
        StringBuilder builder = new StringBuilder();

        for (String message : messages) {
            builder.append(message);
        }

        printMessage(builder.toString());
    }

    /**
     * Output informational message depend from input date and pattern
     * @param message
     * @param pattern
     */
    public void printInfo(String message, Pattern pattern){
        printMessage(bundle.getString("ENTER"), message, "(", pattern.pattern(), "):");
    }

    /**
     * Unacceptable input date
     */
    public void printError(String message){
        printlnMessage(message);
    }

    public void setBundle(String name){
        if (name.equalsIgnoreCase("ENGLISH")){
            Locale.setDefault(Locale.ENGLISH);
            bundle = ResourceBundle.getBundle("ENGLISH", new Locale("en_Us"));
        }else if (name.equalsIgnoreCase("RUSSIAN")){
            Locale.setDefault(new Locale("ru_RU"));
            bundle = ResourceBundle.getBundle("RUSSIAN", new Locale("ru_Ru"));
        }else {
            throw new RuntimeException("No appropriate bundle " + name);
        }


    }
}
