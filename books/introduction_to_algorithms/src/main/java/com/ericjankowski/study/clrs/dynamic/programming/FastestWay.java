package com.ericjankowski.study.clrs.dynamic.programming;

public class FastestWay {
    public static void main(String[] args) {
        int n = 6;
        int [][] a = {{7,9,3,4,8,4},{8,5,6,4,5,7}};
        int [][] t = {{2,3,1,3,4},{2,1,2,2,1}};
        int [] e = {2,4};
        int [] x = {3,2};
        int [][] f = {{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1}};
        int [][] l = {{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1}};
        int fastestTime = -1;
        int fastestPath = -1;
        
        f[0][0] = e[0] + a[0][0];
        f[1][0] = e[1] + a[1][0];
        
        for(int i = 1; i<n; i++){
            if(f[0][i-1] + a[0][i] <= f[1][i-1] + t[1][i-1]+a[0][i]){
                f[0][i] = f[0][i-1] + a[0][i];
                l[0][i] = 1;
            }else{
                f[0][i] = f[1][i-1] + t[1][i-1]+ a[0][i];
                l[0][i] = 2;
            }
            
            if(f[1][i-1] + a[1][i] <= f[0][i-1] + t[0][i-1] + a[1][i]){
                f[1][i] = f[1][i-1] + a[1][i];
                l[1][i] = 2;
            }else{
                f[1][i] = f[0][i-1] + t[0][i-1] + a[1][i];
                l[1][i] = 1;
            }
        }
        if(f[0][n-1] + x[0] <= f[1][n-1] + x[1]){
            fastestTime = f[0][n-1] + x[0];
            fastestPath = 1;
        }else{
            fastestTime = f[1][n-1] + x[1];
            fastestPath = 2;
        }
        
        System.out.println("Fastest Time = " + fastestTime);
        int i = fastestPath;
        System.out.println("line: " + i + " station: " + n);
        for(int j = n-1; j>0; j--){
            System.out.println("line: " + l[fastestPath][j] + " station: " + (j));
        }
    }
}
