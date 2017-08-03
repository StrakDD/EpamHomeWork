package ua.epam.task04.controller;

import ua.epam.task04.View.View;
import ua.epam.task04.model.Model;
import ua.epam.task04.model.entity.IllegalNickNameException;


/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this. model = model;
        this. view = view;
    }


    /**
     * Start process of making Record
     */
    public void processUser(){
        RecordUtility recordUtility = new RecordUtility();
        recordUtility.inputRecord();

        processAddRecord(recordUtility);
        recordUtility.clearRecord();
        recordUtility.inputRecord();
        processAddRecord(recordUtility);

    }

    public void processAddRecord(RecordUtility recordUtility) {
        while (true) {
            try {
                model.addRecord(recordUtility.getRecord());
                break;
            } catch (IllegalNickNameException e) {
                view.printError(View.bundle.getString("EXCEPTION"));
                recordUtility.getNickName();
            }
        }
    }
}
