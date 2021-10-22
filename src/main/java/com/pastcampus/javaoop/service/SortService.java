package com.pastcampus.javaoop.service;

import com.pastcampus.javaoop.logic.BubbleSort;
import com.pastcampus.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
    }
    public List<String> doSort(List<String > list){
        Sort<String> sort = new BubbleSort<>();
        return sort.sort(list);
    }
}
