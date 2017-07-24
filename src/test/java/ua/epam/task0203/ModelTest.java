package ua.epam.task0203;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Denis Starovoitenko on 24.07.2017.
 */
public class ModelTest {
    private Model model;

    @Before
    public void setUp(){
        model = new Model();
        model.setRanges(0, 100);
    }

    @Test
    public void setRanges() throws Exception {
        assertEquals(model.setRanges(50, 20), false);
    }

    @Test
    public void setSecretNumber() throws Exception {
        List<Integer> numbers = new ArrayList<Integer>();
        int length = model.getRangeMax() - model.getRangeMin() - 1;

        for (int i = 0; i < length; i++) {
            numbers.add(i, 0);
        }


        int index;
        for (int i = 0; i < length*100; i++) {
            model.setSecretNumber();
            index = model.getSecretNumber() - model.getRangeMin() - 1;
            numbers.set(index, numbers.get(index) + 1);
        }

        assertFalse( numbers.contains(0));
    }

    @Test
    public void guessEqualNumber() throws Exception {
        model.setSecretNumber();
        int secretNumber = model.getSecretNumber();
        assertTrue( model.guessNumber(secretNumber) == 0);
        //assertTrue( model.guessNumber(secretNumber + 1) == 1);
        //assertTrue( model.guessNumber(secretNumber - 1) == -1);
    }

    @Test
    public void guessBiggerNumber() {
        model.setSecretNumber();
        int secretNumber = model.getSecretNumber();
        assertTrue( model.guessNumber(secretNumber + 1) == 1);
    }

    @Test
    public void guessLowerNumber() {
        model.setSecretNumber();
        int secretNumber = model.getSecretNumber();
        assertTrue( model.guessNumber(secretNumber - 1) == -1);
    }

}