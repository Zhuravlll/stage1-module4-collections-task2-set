package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> mySet = new HashSet<>();
        for (Integer e : sourceList) {
            if (e % 2 == 0) {
                mySet.add(e);
                while (e % 2 == 0) {
                    e /= 2;
                    mySet.add(e);
                }
            }
            else {
                mySet.add(e);
                mySet.add(2* e);
            }
        }
        return mySet;
    }
}
