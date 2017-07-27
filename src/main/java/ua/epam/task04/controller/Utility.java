package ua.epam.task04.controller;

import ua.epam.task04.View.MessageConstants;
import ua.epam.task04.View.View;
import ua.epam.task04.model.entity.FullName;
import ua.epam.task04.model.entity.Group;
import ua.epam.task04.model.entity.Record;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class Utility {

    private Record record;
    private View view;

    public Utility(View view){
        record = new Record();
        this.view = view;
    }

    public Record getRecord() {
        return record;
    }

    public void buildRecord(){
        //getFullName();
        //getNickName();
        //getCommentary();
        getGroup();
    }

    public void getFullName(){
        String[] names = getReadPattern(MessageConstants.FULL_NAME, RegularExpressions.FIO).split(" ");
        record.setFullName(new FullName(names[0], names[1], names[2]));
    }


    public void getNickName(){
        record.setNickName(getReadPattern(MessageConstants.NICK_NAME, RegularExpressions.NICK_NAME));
    }

    public void getCommentary(){
        record.setCommentary(getReadPattern(MessageConstants.COMMENT, RegularExpressions.COMMENTARY));
    }

    public void getGroup(){
        record.setGroup(Group.valueOf(getReadPattern(MessageConstants.GROUP, RegularExpressions.GROUP)));
        System.out.println(record.getGroup());
    }

    public String getReadPattern(String message, String regExp){
        Pattern pattern = Pattern.compile(regExp);
        Scanner reader = new Scanner(System.in);
        reader.useDelimiter("\n");

        view.printInfo(message, pattern);

        while (!reader.hasNext(pattern)){
            view.printError();
            view.printInfo(message, pattern);
            reader.nextLine();
        }
        return reader.next(pattern);
    }
}
