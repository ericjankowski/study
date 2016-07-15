package com.ericjankowski.study.clrs.binary.addition;

import com.eridjankowski.study.utils.ArrayUtils;

public class BinaryAdditionOfArrays_Chapter_02 {
    public static void main(String[] args) {
        int [] a = {1,1,1,1,1};
        int [] b = {1,1,1,1,1};
        int [] sum = new int[a.length + 1];
        
        int carry = 0;
        for(int i=a.length-1; i>=0; i--){
            int localSum = a[i] + b[i] + carry;
            if(localSum<2){
                sum[i+1] = localSum;
                carry = 0;
            }else{
                sum[i+1] = localSum % 2;
                carry = 1;
            }
        }
        sum[0] = carry;
        ArrayUtils.print(sum);
    }
}
