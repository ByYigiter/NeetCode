package backtracking;

import java.util.*;

public class Permutatıons {
    public static void permutationUtil(List<Integer> nums, int i, int numsSize, List<List<Integer>> answer){
        if(i == numsSize){
            answer.add(new ArrayList<Integer>(nums));
        }
        for(int j = i; j < numsSize; j++){
            Collections.swap(nums, i, j);
            permutationUtil(nums, i+1, numsSize, answer);
            Collections.swap(nums, i, j);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new LinkedList();
        int numsSize = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<numsSize;i++)
            list.add(nums[i]);
        permutationUtil(list, 0, numsSize, answer);
        return answer;
    }

    public static void main(String[] args){
        int nums[] = {1, 2, 3};
        List<List<Integer>> answer = permute(nums);
        System.out.println(answer.toString());
    }
}
