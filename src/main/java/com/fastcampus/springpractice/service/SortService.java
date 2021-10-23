package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.BubbleSort;
import com.fastcampus.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //역할 컴포넌트랑 똑같 빈으로 등록 , 서비스 하는 놈이니깐 명시적으로 해줌
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort){
        this.sort = sort;
    }
    public List<String> doSort(List<String > list){
        Sort<String> sort = new BubbleSort<>();
        return sort.sort(list);
    }
}
