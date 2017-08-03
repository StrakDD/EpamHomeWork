package ua.epam.task04.model.entity.builder;

import ua.epam.task04.model.entity.Record;

/**
 * Created by Denis Starovoitenko on 03.08.2017.
 */
public abstract class RecordBuilder {
    Record record;

    void createRecord(){ record = new Record();}

    abstract void createFullname();
    abstract void createNickname();
    abstract void createCommentary();
    abstract void createGroup();
    abstract void createPhone();
    abstract void createEmail();
    abstract void createSkype();
    abstract void createAddress();
    abstract void createRecordDate();
    abstract void createChangeDate();

    Record getRecord(){
        return record;
    }
}
