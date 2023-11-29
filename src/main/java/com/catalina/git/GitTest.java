package com.catalina.git;

import java.util.Arrays;

/**
 * @author RizzoYueng
 * @create 2023-11-29-10:45
 */
public class GitTest {
    public static void main(String[] args) {
        // bubble sort
        int[] arr = {89, 56, 78, 15, 99, 45, 25};
        System.out.println("排序前的数组为："+Arrays.toString(arr));
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (flag == false){
                break;
            }else {
                flag = false;
            }
        }
        System.out.println("排序后的数组为："+Arrays.toString(arr));
    }
}
