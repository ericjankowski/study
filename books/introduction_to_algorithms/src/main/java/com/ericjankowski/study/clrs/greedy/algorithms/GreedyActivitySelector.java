package com.ericjankowski.study.clrs.greedy.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GreedyActivitySelector {
    public static void main(String[] args) {
        int[] startTimes = {-1,1,3,0,5,3,5,6,8,8,2,12};
        int[] finishTimes = {0,4,5,6,7,8,9,10,11,12,13,14};

        List<Integer> activities = greedyActivitySelector(startTimes, finishTimes);
        System.out.println(activities);
    }

    private static List<Integer> greedyActivitySelector(int[] startTimes, int[] finishTimes) {
        List<Integer> activities = new ArrayList<Integer>();
        int i = 0;
        for(int m = 1; m<startTimes.length; m++){
            if(startTimes[m] >= finishTimes[i]){
                activities.add(m);
                i = m;
            }
        }
        return activities;
    }
}
