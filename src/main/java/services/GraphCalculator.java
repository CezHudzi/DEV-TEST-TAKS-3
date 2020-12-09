package services;

import java.util.*;

public class GraphCalculator {

    public int countSeparetedGraphs(int[] input) {

        List<Set<Integer>> grupList = new ArrayList<>();

        for (int i = 1; i <= input[0]; i++) {
            boolean tmpAdded = false;
            Set firstSetFound = new HashSet<>();
            for (Set set : grupList) {
                if (!tmpAdded) {
                    if (set.contains(input[i * 2 - 1]) || set.contains(input[i * 2])) {
                        set.add(input[i * 2 - 1]);
                        set.add(input[i * 2]);
                        firstSetFound = set;
                        tmpAdded = true;
                    }
                }
                else {
                    if (set.contains(input[i * 2 - 1]) || set.contains(input[i * 2])) {
                        set.add(input[i * 2 - 1]);
                        set.add(input[i * 2]);
                        firstSetFound.addAll(set);
                        grupList.remove(set);
                        break;
                    }
                }

            }
            if (!tmpAdded) {
                Set<Integer> newSet = new HashSet<>();
                newSet.add(input[i * 2 - 1]);
                newSet.add(input[i * 2]);
                grupList.add(newSet);
            }
        }


        return grupList.size();
    }




}
