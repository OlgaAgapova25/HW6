package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListAverage {

    private List<Integer> lst1;
    private List<Integer> lst2;

    public ListAverage(List<Integer> lst1, List<Integer> lst2) {
        this.lst1 = lst1;
        this.lst2 = lst2;
    }

    public ListAverage(){}

    public List<Integer> getLst1() {
        return lst1;
    }

    public void setLst1(List<Integer> lst1) {
        this.lst1 = lst1;
    }

    public List<Integer> getLst2() {
        return lst2;
    }

    public void setLst2(List<Integer> lst2) {
        this.lst2 = lst2;
    }
    public List<Integer> calcAvrg() {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(lst1.stream().reduce(Integer::sum).get() / lst1.size());
        resultList.add(lst2.stream().reduce(Integer::sum).get() / lst2.size());
        return resultList;
    }

    public String compareListsAverages() {
        List<Integer> averageList = this.calcAvrg();
        if (averageList.get(0) > averageList.get(1)) return "1st list average is maximal";
        else if (averageList.get(0) < averageList.get(1)) return "2nd list average is maximal";
        else return "Averages are equal";
    }
}