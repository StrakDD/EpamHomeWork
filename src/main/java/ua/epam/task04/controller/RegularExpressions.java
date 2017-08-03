package ua.epam.task04.controller;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class RegularExpressions {
    public final static String NICK_NAME = "(?U)\\w{1,20}";
    public final static String COMMENTARY = "(?U)[^\\n]{1,50}";
    public final static String GROUP = "(?i)(family|friend|student|colleague)";
    public final static String PHONE1 = "(\\d[- ]?){7}";
    public final static String PHONE2 = "(\\d[- ]?){10}";
    public final static String EMAIL = "([\\w-\\.]+)@((?:[\\w]+\\.)+)([a-zA-Z]{2,4})";
    public final static String SKYPE = "[\\w\\.-_]{2,25}";

}
