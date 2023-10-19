package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListAverageTest {
    private ListAverage listAverage;

    @BeforeEach
    public void setUp(){
        listAverage = new ListAverage(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6)
        );
    }

    @Test
    void calcAvrgCorrectness() {
        int expectedValue = 5;
        int actualValue = listAverage.calcAvrg().get(1);
        assertEquals(expectedValue, actualValue, "CalcAvrg method is incorrect");
    }

    @Test
    void compareListAveragesCorrectness() {
        String expectedMessage = "2nd list average is maximal";
        String actualMessage = listAverage.compareListsAverages();
        assertEquals(expectedMessage, actualMessage, "Method compareListsAverages works incorrect");
    }


    @Test
    void getLst1(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(expected, listAverage.getLst1());
    }

    @Test
    void getLst2(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(4,5,6));
        assertEquals(expected, listAverage.getLst2());
    }

    @Test
    void setLst1(){
        List<Integer> expected = Arrays.asList(15,20,30);
        listAverage.setLst1(expected);
        assertEquals(expected, listAverage.getLst1());
    }
    @Test
    void setLst2(){
        List<Integer> expected = Arrays.asList(25,45);
        listAverage.setLst2(expected);
        assertEquals(expected, listAverage.getLst2());
    }

}