package com.biturd;

/**
 * @Program: logStudy
 * @Description: MaxArray
 * @Author: BitterGourd
 * @Date: 2020-04-02 19:40
 */
public class MaxArray {

    public static int maxSubArray(int[] arr){
        int sum = 0;
        int maxsum = 0;
        for(int i = 0; i < arr.length; i ++){
            if(sum <= 0){
                sum = arr[i];
            }else{
                sum += arr[i];
            }
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        return maxsum;
    }


}
