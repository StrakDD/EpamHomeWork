package ua.epam.task04.controller;


import ua.epam.task04.View.View;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Denis Starovoitenko on 28.07.2017.
 */
public class ParsePattern {

    public static String readPattern(String message, String regExp){
        Pattern pattern = Pattern.compile(regExp);
        Scanner reader = new Scanner(System.in);
        reader.useDelimiter("\n");

        return getString(message, pattern, reader);
    }

    private static String getString(String message, Pattern pattern, Scanner reader){
        View view = new View();

        view.printInfo(message, pattern);

        while (!reader.hasNext(pattern)){
            view.printError();
            view.printInfo(message, pattern);
            reader.nextLine();
        }
        return reader.next(pattern);
    }
}
