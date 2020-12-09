package services;

import java.util.*;

public class GraphCalculator {

    public int countSeparatedGraphs(int[] input) {

        List<Set<Integer>> groupList = new ArrayList<>();

        for (int i = 1; i <= input[0]; i++) {
            boolean tmpAdded = false;
            Set<Integer> firstSetFound = new HashSet<>();
            for (Set<Integer> set : groupList) {

                if (set.contains(input[i * 2 - 1]) || set.contains(input[i * 2])) {
                    set.add(input[i * 2 - 1]);
                    set.add(input[i * 2]);
                    if (!tmpAdded) {
                        firstSetFound = set;
                        tmpAdded = true;
                    } else {
                        firstSetFound.addAll(set);
                        groupList.remove(set);
                        break;
                    }
                }
            }
            if (!tmpAdded) {
                Set<Integer> newSet = new HashSet<>();
                newSet.add(input[i * 2 - 1]);
                newSet.add(input[i * 2]);
                groupList.add(newSet);
            }
        }
        return groupList.size();
    }


}
