package ua.epam.task04;


import ua.epam.task04.View.View;
import ua.epam.task04.controller.Controller;
import ua.epam.task04.model.Model;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.processUser();
    }
}
