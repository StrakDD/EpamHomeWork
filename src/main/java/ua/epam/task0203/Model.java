package ua.epam.task0203;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Denis Starovoitenko on 21.07.2017.
 */
public class Model {
    private int rangeMin;
    private int rangeMax;
    private int secretNumber;

    private List<Integer> guesses;

    public Model(){
        this.guesses = new ArrayList<Integer>();
    }

    public boolean setRanges(int min, int max){
        if ( (max < min) || ( Math.abs(max - min) < 2) ) return false;

        this.rangeMin = min;
        this.rangeMax = max;

        return true;
    }

    public int getRangeMin(){
        return this.rangeMin;
    }

    public int getRangeMax(){
        return this.rangeMax;
    }

    public List<Integer> getGuesses(){
        return this.guesses;
    }

    public void setSecretNumber() {

        this.secretNumber = new Random().nextInt(rangeMax - rangeMin - 1) + rangeMin + 1;
    }

    public int getSecretNumber(){
        return this.secretNumber;
    }

    /**
     * This method check input secretNumber for equality to exist secretNumber
     * @param number assumption numper
     * @return if guess secretNumber - true, otherwise - false
     */
    public int guessNumber(int number){
        writeGuesses(number);
        if ( number == secretNumber){
            return 0;
        }
        return checkRange(number);

    }

    /**
     *
     * @param number
     */
    public int checkRange(int number){
        if ( number > secretNumber){
            rangeMax = number;
            return 1;
        }else {
            rangeMin = number;
            return -1;
        }
    }

    /**
     *
     * @param number
     */
    public void writeGuesses(int number){
        guesses.add(number);
    }

    public int getLastGuess(){
        if (guesses.size() == 0){
            return 0;
        }
        return guesses.get(guesses.size() - 1);
    }
}
