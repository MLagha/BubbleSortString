package com.sparta.ml;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {

        String[] orgArray = {"is", "had", "has", "could", "did", "take", "say", "want", "must", "move", "found", "keep", "might", "got", "took", "eat", "being", "was", "were", "will", "look", "been", "get", "know", "help", "show", "ask", "try", "study", "start", "close", "run", "carry", "watch", "leave", "are", "can", "would", "write", "call", "come", "live", "tell", "set", "went", "change", "learn", "thought", "seem", "walk", "hear", "let", "be", "said", "make", "go", "am", "made", "give", "follow", "put", "read", "play", "should", "saw", "open", "began", "stop", "cut", "have", "use", "like", "see", "find", "may", "think", "came", "does", "need", "spell", "add", "turn", "begin", "grow", "miss", "talk"};
        System.out.println("Original array: " + Arrays.toString(orgArray));

        String [] AscendingArray = BubbleSort.ascendingIteration(orgArray);
        System.out.println("Asc sorted array: " + Arrays.toString(AscendingArray));
    }
}
