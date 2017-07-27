package ua.epam.task04.controller;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class RegularExpressions {
    public final static String FIO = "([A-Z][a-z]{1,25} ){2}[A-Z][a-z]{1,25}";
    public final static String NICK_NAME = "\\w{1,20}";
    public final static String COMMENTARY = "[^\\n]{1,50}";
    //public final static String GROUP = "(?i)(family | friend | student | colleague)";
    public final static String GROUP = "student";
}
