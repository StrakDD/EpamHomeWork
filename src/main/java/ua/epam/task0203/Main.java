package ua.epam.task0203;

/**
 * Created by Denis Starovoitenko on 21.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processRun();
    }
}