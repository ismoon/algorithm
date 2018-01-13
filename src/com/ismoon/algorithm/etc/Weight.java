/*
 * ismoon
 */

package com.ismoon.algorithm.etc;

import java.util.Arrays;

/**
 * @author ismoon on 2017-08-04.
 */
public class Weight {
    public static void main(String[] args){
        for (int i=0; i < 100; i ++)
            printWeight();
    }

    private static void printWeight() {
        int[] weight = {40,10,5,30,15}; //상품별 가중치(weight)
        int[] items = {1,2,3,-1,0}; // 결과(value)
        int[] array = new int[weight.length];

        for (int i=0; i < weight.length; i++) {
            if(i==0) array[0] =  weight[0];
            else array[i] = array[i-1] + weight[i]; // 설정 된 가중치에 의한 구간 설정 40, 50, 55, 85, 100
        }

        int randomValue = (int)(Math.random() * array[array.length-1]);
        int index = Arrays.binarySearch(array, randomValue);
        if (index < 0 ) index = Math.abs(index) -1;

        System.out.println("item : " + items[index]);
    }
}
