package arrays_hashing;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int []arr = {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(arr));
        int val=2;
        int adet =Arrays.binarySearch(arr, 0, arr.length,val);
        System.out.println(adet);
        int []brr =new int[arr.length-adet];
        int idx = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=2){
                brr[idx]=arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }

}
