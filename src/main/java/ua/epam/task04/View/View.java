package ua.epam.task04.View;

import java.util.regex.Pattern;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class View {

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
        printMessage(MessageConstants.ENTER, message, MessageConstants.LBRACKET,
                    pattern.pattern(), MessageConstants.RBRACKET, MessageConstants.COLONE);
    }

    /**
     * Unacceptable input date
     */
    public void printError(){
        printlnMessage(MessageConstants.ERROR);
    }
}
