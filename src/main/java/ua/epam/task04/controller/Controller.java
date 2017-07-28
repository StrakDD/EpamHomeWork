package ua.epam.task04.controller;

import ua.epam.task04.View.View;
import ua.epam.task04.model.Model;


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
        RecordUtility recordUtility = new RecordUtility(view);
        recordUtility.buildRecord();
    }
}
