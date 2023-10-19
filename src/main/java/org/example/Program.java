package org.example;

import java.util.List;

public class Program {
    private ListAverage listAverage;

    public Program(ListAverage listAverage) {
        this.listAverage = listAverage;
    }

    public void start(List<Integer> list1, List<Integer> list2){
            listAverage.setLst1(list1);
            listAverage.setLst2(list2);
            String result = listAverage.compareListsAverages();
            System.out.println(result);
    }
}