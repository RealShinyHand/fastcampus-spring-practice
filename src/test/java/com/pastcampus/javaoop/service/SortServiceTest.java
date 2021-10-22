package com.pastcampus.javaoop.service;

import com.pastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sort = new SortService(new JavaSort<String>());

    @DisplayName("서비스 소트 테스트 1")
    @Test
    void test(){
        //given
        //when
       List<String> actual = sort.doSort(Arrays.asList("3","2","1"));

       String[] a = {"1","2","3"};
        //then
        assertEquals( new ArrayList(Arrays.asList(a)),actual);
    }
}