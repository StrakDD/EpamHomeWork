package ua.epam.task04.model.entity.builder;

import ua.epam.task04.model.entity.Address;
import ua.epam.task04.model.entity.FullName;
import ua.epam.task04.model.entity.Group;
import ua.epam.task04.model.entity.PhoneNumber;

import java.util.Date;

/**
 * Created by Denis Starovoitenko on 03.08.2017.
 */
public class EmptyRecord extends RecordBuilder {
    @Override
    void createFullname() {
        record.setFullName(new FullName());
    }

    @Override
    void createNickname() {
        record.setNickName("");
    }

    @Override
    void createCommentary() {
        record.setCommentary("");
    }

    @Override
    void createGroup() {
        record.setGroup(Group.STUDENT);
    }

    @Override
    void createPhone() {
        record.setPhone(new PhoneNumber());
    }

    @Override
    void createEmail() {
        record.setEmail("");
    }

    @Override
    void createSkype() {
        record.setSkype("");
    }

    @Override
    void createAddress() {
        record.setAddress(new Address());
    }

    @Override
    void createRecordDate() {
        record.setRecord(new Date());
    }

    @Override
    void createChangeDate() {
        record.setChange(new Date());
    }
}
