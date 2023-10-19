package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));;
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,6));;
        Program program = new Program(new ListAverage());
        program.start(list1, list2);
    }
}