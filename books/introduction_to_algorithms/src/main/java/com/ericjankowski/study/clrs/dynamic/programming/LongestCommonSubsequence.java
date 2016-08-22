package com.ericjankowski.study.clrs.dynamic.programming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        char [] x = {'A','B','C','B','D','A','B'};
        char [] y = {'B','D','C','A','B','A'};
        int [][] c = new int[x.length+1][y.length+1];
        int [][] b = new int[x.length+1][y.length+1];
        
        int m = x.length;
        int n = y.length;
        
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(x[i] == y[j]){
                    System.out.println("found a match");
                    c[i][j] = c[i-1][j-1] + 1;
                    b[i][j] = 45;
                }else if(c[i-1][j] >= c[i][j-1]){
                    c[i][j] = c[i-1][j];
                    b[i][j] = 90;
                }else{
                    c[i][j] = c[i][j-1];
                    b[i][j] = 0;
                }
            }
        }
        
        printLCS(b, x, x.length, y.length);
    }

    private static void printLCS(int[][] b, char[] x, int i, int j) {
        System.out.println("i: " + i + " :: j: " + j);
        System.out.println(b[i][j]);
        
        if(i == 0 || j == 0){
            return;
        }
        if(b[i][j] == 45){
            printLCS(b, x, i-1, j-1);
            System.out.print(x[i]);
        }else if(b[i][j] == 90){
            printLCS(b, x, i-1, j);
        }else{
            printLCS(b, x, i, j-1);
        }
        
    }
}
