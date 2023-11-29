package com.catalina.git;

import java.util.Arrays;

/**
 * @author RizzoYueng
 * @create 2023-11-29-10:45
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("modified by hot fix branch V2");
        // bubble sort
        int[] arr = {89, 56, 78, 15, 99, 45, 25};
        System.out.println("排序前的数组为："+Arrays.toString(arr));
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j+1]){
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
        System.out.println("升序排序后的数组为："+Arrays.toString(arr));
        shellSort(arr);
        System.out.println("降序排序后的数组为："+Arrays.toString(arr));
    }

    /**
     * 插入排序
     * @param arr：要排序的数组
     */
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int insertValue = arr[i];
            int insertIndex = i  - 1;
            while (insertIndex >= 0 && insertValue < arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex --;
            }
            arr[insertIndex+1] = insertValue;
        }
    }

    /**
     * 希尔排序
     * @param arr：未排序的数组
     */
    public static void shellSort(int[] arr){
        for (int gap = arr.length/2; gap > 0;gap/=2){
            for (int i = gap; i < arr.length; i++){
                int insertIndex = i - gap;
                int insertValue = arr[i];
                while(insertIndex >= 0 && insertValue<arr[insertIndex]){
                    arr[insertIndex+gap] = arr[insertIndex];
                    insertIndex -= gap;
                }
                arr[insertIndex+gap] = insertValue;
            }
        }
    }
}
