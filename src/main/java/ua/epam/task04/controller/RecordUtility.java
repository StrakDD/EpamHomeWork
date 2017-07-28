package ua.epam.task04.controller;

import ua.epam.task04.View.MessageConstants;
import ua.epam.task04.View.View;
import ua.epam.task04.model.entity.*;

import static ua.epam.task04.controller.ParsePattern.readPattern;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class RecordUtility {

    private Record record;
    private View view;

    public RecordUtility(View view){
        this.view = view;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void getFullName(){
        String[] names = readPattern(MessageConstants.FULL_NAME, RegularExpressions.FIO).split(" ");
        record.setFullName(new FullName(names[0], names[1], names[2]));
    }

    public void getNickName(){
        record.setNickName(readPattern(MessageConstants.NICK_NAME, RegularExpressions.NICK_NAME));
    }

    public void getCommentary(){
        record.setCommentary(readPattern(MessageConstants.COMMENT, RegularExpressions.COMMENTARY));
    }

    public void getGroup(){
        record.setGroup(Group.valueOf(readPattern(MessageConstants.GROUP, RegularExpressions.GROUP).toUpperCase()));
    }

    public void getPhone(){
        String home = readPattern(MessageConstants.PHONE1, RegularExpressions.PHONE1);
        String mobile = readPattern(MessageConstants.PHONE2, RegularExpressions.PHONE2);
        String mobileAdd = "";
        String decision = readPattern(MessageConstants.QUESTION_PHONE, "(?i)[yn]");

        if (decision.equalsIgnoreCase("y")) {
            mobileAdd = readPattern(MessageConstants.PHONE2, RegularExpressions.PHONE2);
        }
        record.setPhone(new PhoneNumber(home, mobile, mobileAdd));
    }

    public void getEmail(){
        record.setEmail(readPattern(MessageConstants.EMAIL, RegularExpressions.EMAIL));
    }

    public void getSkype(){
        record.setSkype(readPattern(MessageConstants.SKYPE, RegularExpressions.SKYPE));
    }

    /**
     * Read Address in one string and than parse for pieces
     */
    public void getAddress(){
        String[] adress = readPattern(MessageConstants.ADDRESS, RegularExpressions.ADDRESS)
                            .split(" ");

        int index = Integer.parseInt(adress[0]);
        String city = adress[1];
        String street = adress[2];
        int house = Character.isLetter(adress[3].charAt(adress[3].length() -1))
                    ? Integer.parseInt(adress[3].substring(0, adress[3].length()-1))
                    : Integer.parseInt(adress[3]);
        int apartment = Integer.parseInt(adress[4]);

        record.setAddress(new Address(index, city,street, house, apartment));
    }

    /**
     * Make record from input data set
     */
    public void buildRecord(){
        record = new Record();
        getFullName();
        getNickName();
        getCommentary();
        getGroup();
        getPhone();
        getEmail();
        getSkype();
        getAddress();
    }
}
