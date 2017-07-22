package ua.epam.Task0203;

import java.util.Scanner;

/**
 * Created by Denis Starovoitenko on 21.07.2017.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model,View view){
        this.model = model;
        this.view = view;
    }

    /**
     *
     */
    public void processRun(){
        Scanner scanner = new Scanner(System.in);
        int info;

        model.setRanges(GlobalConstants.RANGE_MIN, GlobalConstants.RANGE_MAX);
        model.setSecretnumber();

        while(true){
            if ((info = model.guessNumber(getDigitInRange(scanner))) == 0) {
                break;
            }
            view.printFailedMessage(model, info);
        }

        view.printSuccessfulMessage(model);
        scanner.close();
    }

    /**
     * Check if input is digit and return it.
     * @param scanner
     * @return digit
     */
    public int getDigit(Scanner scanner){
        while(!scanner.hasNextInt()){
            view.printWrongMessage();
            view.printRange(model);
            scanner.next();
        }

        return scanner.nextInt();
    }

    /**
     * Change searching range based on previous input number
     * @param scanner
     * @return
     */
    public int getDigitInRange(Scanner scanner){
        int result;

        view.printRange(model);
        while ( isRange( result = getDigit(scanner) ) ){
            view.printWrongMessage();
            view.printRange(model);
        }

        return result;
    }

    public boolean isRange(int number){
        return (number <= model.getRangeMin()) || (number >= model.getRangeMax());
    }
}
