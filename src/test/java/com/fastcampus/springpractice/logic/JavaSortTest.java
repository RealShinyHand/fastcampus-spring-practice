package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @Test
    void given_list_whenExecuting_thenReturn(){
        //given
        JavaSort<Integer> javaSort = new JavaSort<Integer>();
        //when
        List<Integer> slist = javaSort.sort(Arrays.asList(3,6,2,1,5));

        //then
        assertEquals(Arrays.asList(1,2,3,5,6),slist);
    }
}