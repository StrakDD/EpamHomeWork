package ua.epam.task0203;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by Denis Starovoitenko on 24.07.2017.
 */
public class ControllerTest {
    private Controller controller;
    private Model model;

    @Before
    public void setUp(){
        View view = new View();

        model = new Model();
        model.setRanges(0, 100);
        controller = new Controller(model, view);
    }


    @Test
    public void isRange() throws Exception {
        int number = 15;
        assertTrue(controller.isRange(number) == true);
    }

}