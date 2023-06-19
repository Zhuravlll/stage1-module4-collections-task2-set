package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set <String> mySet = new LinkedHashSet<>();
        for (String e: firstSet) {
            if (secondSet.contains(e) && !thirdSet.contains(e)) {
                mySet.add(e);
            }
        }
        for (String t: thirdSet) {
            if (!firstSet.contains(t) && !secondSet.contains(t)) {
                mySet.add(t);
            }
        }
        return mySet;
    }
}
