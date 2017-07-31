package ua.epam.task04.model.entity;

/**
 * Created by Denis Starovoitenko on 31.07.2017.
 */
public class IllegalNickNameException extends Exception {
    public  IllegalNickNameException(){
        super();
    }

    public IllegalNickNameException(String message){
        super(message);
    }
}
