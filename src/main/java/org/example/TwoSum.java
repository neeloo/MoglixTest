package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int arr[]= {2,3,4,5,6};
        int target = 11;
        int a[] = TwoSumNumber(arr,target);
        System.out.println(Arrays.toString(a));
    }

    private static int [] TwoSumNumber(int[] arr, int target) {
        Map<Integer ,Integer>map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

}
