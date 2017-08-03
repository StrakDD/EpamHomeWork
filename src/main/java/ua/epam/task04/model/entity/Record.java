package ua.epam.task04.model.entity;

import ua.epam.task04.model.entity.builder.BuildRecord;
import ua.epam.task04.model.entity.builder.EmptyRecord;
import ua.epam.task04.model.entity.prototype.Copyable;

import java.util.Date;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class Record implements Copyable{
    private FullName fullName;
    private String nickName;
    private String commentary;
    private Group group;
    private PhoneNumber phone;
    private String email;
    private String skype;
    private Address address;
    private Date record;
    private Date change;

    public Record(){

    }

    public Date getRecord() {
        return record;
    }

    public void setRecord(Date record) {
        this.record = record;
        this.change = new Date();
    }

    public Date getChange() {
        return change;
    }

    public void setChange(Date change) {
        this.change = change;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        this.change = new Date();
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
        this.change = new Date();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.change = new Date();
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
        this.change = new Date();
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
        this.change = new Date();
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
        this.change = new Date();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        this.change = new Date();
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
        this.change = new Date();
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("*******Record*******")
                .append("\nFull name: ").append(fullName)
                .append("\nNick name: ").append(nickName)
                .append("\nCommentary: ").append(commentary)
                .append("\nGroup: ").append(group)
                .append("\n").append(phone)
                .append("\nEmail: ").append(email)
                .append("\nSkype: ").append(skype)
                .append("\n").append(address)
                .append("\n(Date) Any changes to the record: ").append(change)
                .append("\n(Date) Record to the NoteBook: ").append(record);

        return  build.toString();
    }

    @Override
    public Object copy() {
        BuildRecord build = new BuildRecord();
        build.setBuilder(new EmptyRecord());
        Record record = build.buildRecord();
        record.setAddress(address);
        record.setEmail(email);
        record.setChange(change);
        record.setCommentary(commentary);
        record.setRecord(this.record);
        record.setGroup(group);
        record.setPhone(phone);
        record.setFullName(fullName);
        record.setNickName(nickName);
        record.setSkype(skype);

        return record;
    }
}
