package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String[] numsInput = input.nextLine().split(",");
        int target = input.nextInt();
        int[] nums = new int[numsInput.length];
        for (int i = 0; i < numsInput.length; i++) {
            nums[i] = Integer.parseInt(numsInput[i]);
        }
        System.out.println(twoSum(nums, target));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (hashmap.containsKey(num)) {
                return new int[]{hashmap.get(num), i};
            } else {
                hashmap.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}



