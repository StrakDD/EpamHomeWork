package ua.epam.task04.model.entity.builder;

import ua.epam.task04.model.entity.Record;

/**
 * Created by Denis Starovoitenko on 03.08.2017.
 */
public class BuildRecord {
    RecordBuilder builder;

    public void setBuilder(RecordBuilder recordBuilder){
        this.builder = recordBuilder;
    }

    public Record buildRecord(){
        builder.createRecord();
        builder.createFullname();
        builder.createNickname();
        builder.createCommentary();
        builder.createGroup();
        builder.createPhone();
        builder.createEmail();
        builder.createSkype();
        builder.createAddress();
        builder.createRecordDate();
        builder.createChangeDate();

        return builder.getRecord();
    }
}
