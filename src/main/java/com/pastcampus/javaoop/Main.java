package com.pastcampus.javaoop;

import com.pastcampus.javaoop.logic.BubbleSort;
import com.pastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("hello World");
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
