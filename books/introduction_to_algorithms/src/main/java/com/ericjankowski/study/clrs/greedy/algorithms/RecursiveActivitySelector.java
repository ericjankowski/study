package com.ericjankowski.study.clrs.greedy.algorithms;

import java.util.ArrayList;
import java.util.List;


public class RecursiveActivitySelector {
    
    public static void main(String[] args) {
        int[] startTimes = {-1,1,3,0,5,3,5,6,8,8,2,12};
        int[] finishTimes = {0,4,5,6,7,8,9,10,11,12,13,14};

        List<Integer> activities = recursiveActivitySelector(startTimes, finishTimes, 0, startTimes.length);
        System.out.println(activities);
    }

    private static List<Integer> recursiveActivitySelector(int[] startTimes, int[] finishTimes, int i, int j) {
        List<Integer> result = new ArrayList<>();
        int m = i+1;
        while(m<j && startTimes[m] < finishTimes[i] ){
            m++;
        }
        if (m<j){
            result.add(m);
            result.addAll(recursiveActivitySelector(startTimes, finishTimes, m, j));
        }
        return result;
    }
}
