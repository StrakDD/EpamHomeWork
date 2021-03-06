package ua.epam.task04.controller;

import ua.epam.task04.View.View;
import ua.epam.task04.model.entity.*;
import ua.epam.task04.model.entity.builder.BuildRecord;
import ua.epam.task04.model.entity.builder.EmptyRecord;

import static ua.epam.task04.controller.ParsePattern.readPattern;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class RecordUtility {

    private Record record;

    public RecordUtility(){
        BuildRecord buildRecord = new BuildRecord();
        buildRecord.setBuilder(new EmptyRecord());
        record = buildRecord.buildRecord();
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public void getFullName(){
        String[] names = readPattern(View.bundle.getString("FULL_NAME"), View.bundle.getString("FIO")).split(" ");
        record.setFullName(new FullName(names[0], names[1], names[2]));
    }

    public void getNickName(){
        record.setNickName(readPattern(View.bundle.getString("NICK_NAME"), RegularExpressions.NICK_NAME));
    }

    public void getCommentary(){
        record.setCommentary(readPattern(View.bundle.getString("COMMENT"), RegularExpressions.COMMENTARY));
    }

    public void getGroup(){
        record.setGroup(Group.valueOf(readPattern(View.bundle.getString("GROUP"), RegularExpressions.GROUP).toUpperCase()));
    }

    public void getPhone(){
        String home = readPattern(View.bundle.getString("PHONE1"), RegularExpressions.PHONE1);
        String mobile = readPattern(View.bundle.getString("PHONE2"), RegularExpressions.PHONE2);
        String mobileAdd = "";
        String decision = readPattern(View.bundle.getString("QUESTION_PHONE"), "(?i)[yn]");

        if (decision.equalsIgnoreCase("y")) {
            mobileAdd = readPattern(View.bundle.getString("PHONE2"), RegularExpressions.PHONE2);
        }
        record.setPhone(new PhoneNumber(home, mobile, mobileAdd));
    }

    public void getEmail(){
        record.setEmail(readPattern(View.bundle.getString("EMAIL"), RegularExpressions.EMAIL));
    }

    public void getSkype(){
        record.setSkype(readPattern(View.bundle.getString("SKYPE"), RegularExpressions.SKYPE));
    }

    /**
     * Read Address in one string and than parse for pieces
     */
    public void getAddress(){
        String[] adress = readPattern(View.bundle.getString("ADDRESS"), View.bundle.getString("REG_ADDRESS"))
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
    public void inputRecord(){
        getFullName();
        getNickName();
        getCommentary();
        getGroup();
        getPhone();
        getEmail();
        getSkype();
        getAddress();
    }

    public void clearRecord(){
        record = new Record();
    }
}
