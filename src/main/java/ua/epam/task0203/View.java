package ua.epam.task0203;


/**
 * Created by Denis Starovoitenko on 21.07.2017.
 */
public class View {
    public static final String HEADER = "**********************************";
    public static final String INFORMATION_DATE = "You need to guess the exist number in range ";
    public static final String WRONG_INPUT_DATA = "Wrong input data!!";
    public static final String SUCCESS_TRY = "Congratulation!!! Required number: ";
    public static final String NUMBER_ATTEMPS = "Number of attempts: ";
    public static final String MORE_INF = "is more than secret number!";
    public static final String LESS_INF = "is less than secret number!";
    public static final String CHECKED_NUMBERS = "All checked numbers : ";

    public void printMessage(String message){
        System.out.print(message);
    }

    public void printlnMessage(String message){
        System.out.println(message);
    }

    public void printRange(Model model){
        printMessage(String.format("%s[ %d - %d ] :", INFORMATION_DATE,
                model.getRangeMin(), model.getRangeMax()));
    }

    public void printWrongMessage(){
        printMessage(WRONG_INPUT_DATA + " ");
    }


    public void printFailedMessage(Model model, int info){
        printlnMessage(HEADER);
        if (info == 1){
            printlnMessage(String.format("%d %s ", model.getLastGuess(),MORE_INF ));
        }else {
            printlnMessage(String.format("%d %s ", model.getLastGuess(),LESS_INF ));
        }
        printlnMessage(CHECKED_NUMBERS + model.getGuesses());
    }

    public void printSuccessfulMessage(Model model){
        printlnMessage(HEADER);
        printlnMessage(SUCCESS_TRY + model.getLastGuess());
        printlnMessage(NUMBER_ATTEMPS + model.getGuesses().size() + " : " + model.getGuesses());
    }
}
