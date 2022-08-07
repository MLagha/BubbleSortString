package com.sparta.ml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    @DisplayName("String Ascending Order")
    void AscendingArray(){
        String [] unsortedArray = { "find", "get", "be", "does", "eat", "add", "call"};
        String [] expected = {"add", "be", "call", "does", "eat", "find", "get"};
        String [] answer = BubbleSort.ascendingIteration(unsortedArray);
        Assertions.assertArrayEquals(expected, answer);
    }
}