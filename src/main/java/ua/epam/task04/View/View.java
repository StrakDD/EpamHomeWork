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

    public String getMessage(String...messages){
        StringBuilder builder = new StringBuilder();

        for (String message : messages) {
            builder.append(message);
        }

        return builder.toString();
    }

    public void printInfo(String message, Pattern pattern){
        printMessage(getMessage(MessageConstants.ENTER, message, MessageConstants.LBRACKET,
                                pattern.pattern(), MessageConstants.RBRACKET, MessageConstants.COLONE));
    }

    public void printError(){
        printMessage(MessageConstants.ERROR);
    }
}
