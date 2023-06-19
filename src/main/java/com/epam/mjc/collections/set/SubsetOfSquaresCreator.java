package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet <Integer> mySet = new TreeSet<>();
        for (Integer e: sourceList
             ) {
            mySet.add(e * e);
        }
        if (mySet.contains(upperBound)) {
            upperBound++;
        }
        return  mySet.subSet(lowerBound, upperBound);
    }
}
