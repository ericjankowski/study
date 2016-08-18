package com.ericjankowski.study.clrs.dynamic.programming;

public class FastestWay {
    public static void main(String[] args) {
        int n = 6;
        int [][] timeAtStation = {{7,9,3,4,8,4},{8,5,6,4,5,7}};
        int [][] timeToSwitchLines = {{2,3,1,3,4},{2,1,2,2,1}};
        int [] entranceTime = {2,4};
        int [] exitTime = {3,2};
        int [][] timeSpent = {{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1}};
        int [][] paths = {{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1}};
        int fastestTime = -1;
        int fastestPath = -1;
        
        timeSpent[0][0] = entranceTime[0] + timeAtStation[0][0];
        timeSpent[1][0] = entranceTime[1] + timeAtStation[1][0];
        
        for(int i = 1; i<n; i++){
            if(timeSpent[0][i-1] + timeAtStation[0][i] <= timeSpent[1][i-1] + timeToSwitchLines[1][i-1]+timeAtStation[0][i]){
                timeSpent[0][i] = timeSpent[0][i-1] + timeAtStation[0][i];
                paths[0][i] = 1;
            }else{
                timeSpent[0][i] = timeSpent[1][i-1] + timeToSwitchLines[1][i-1]+ timeAtStation[0][i];
                paths[0][i] = 2;
            }
            
            if(timeSpent[1][i-1] + timeAtStation[1][i] <= timeSpent[0][i-1] + timeToSwitchLines[0][i-1] + timeAtStation[1][i]){
                timeSpent[1][i] = timeSpent[1][i-1] + timeAtStation[1][i];
                paths[1][i] = 2;
            }else{
                timeSpent[1][i] = timeSpent[0][i-1] + timeToSwitchLines[0][i-1] + timeAtStation[1][i];
                paths[1][i] = 1;
            }
        }
        if(timeSpent[0][n-1] + exitTime[0] <= timeSpent[1][n-1] + exitTime[1]){
            fastestTime = timeSpent[0][n-1] + exitTime[0];
            fastestPath = 1;
        }else{
            fastestTime = timeSpent[1][n-1] + exitTime[1];
            fastestPath = 2;
        }
        
        System.out.println("Fastest Time = " + fastestTime);
        int i = fastestPath;
        System.out.println("line: " + i + " station: " + n);
        for(int j = n-1; j>0; j--){
            System.out.println("line: " + paths[fastestPath][j] + " station: " + (j));
        }
    }
}
