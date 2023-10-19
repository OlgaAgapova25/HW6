package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProgramTest {
    @Spy
    private ListAverage listAverage;
    @Spy
    @InjectMocks
    private Program program;

    @BeforeEach
    public void setUp(){
        listAverage = new ListAverage();
        program = new Program(listAverage);
    }

    @Test
    void programIsCorrect() {
       List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,1));
       List<Integer> list2 = new ArrayList<>(Arrays.asList(2,2,2));
        String expectedMessage = "2nd list average is maximal\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        program.start(list1, list2);
        String actualMessage = outContent.toString().replaceAll("\r", "");
        System.setOut(System.out);
        assertEquals(expectedMessage, actualMessage);
    }
}