package ua.epam.task04.model.entity;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class FullName {
    private String name;
    private String surName;
    private String patronymic;

    public FullName(){
    }

    public FullName(String surName, String name, String patronymic){
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getShortName(){

        return new StringBuilder(surName).append(" ").append(name.charAt(0)).append(".").toString();
    }
}
