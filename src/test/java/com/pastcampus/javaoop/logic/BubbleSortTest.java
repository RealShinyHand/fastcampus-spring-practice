package com.pastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void given_list_whenExecuting_thenReturn(){
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        //when
        List<Integer> slist = bubbleSort.sort(Arrays.asList(3,6,2,1,5));

        //then
        assertEquals(Arrays.asList(1,2,3,5,6),slist);
    }
}