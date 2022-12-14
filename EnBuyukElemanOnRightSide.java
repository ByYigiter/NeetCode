package arrays_hashing;

import java.util.Arrays;

public class EnBuyukElemanOnRightSide {
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        int []newarr = new int[arr.length];
        int enbuyuk= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>enbuyuk){
                    enbuyuk=arr[j];
                }
            }
            newarr[i]=enbuyuk;
            enbuyuk=0;
            if(i==arr.length-1){
                newarr[i]=-1;
            }
        }
        System.out.println(Arrays.toString(newarr));//[18, 6, 6, 6, 1, -1]
    }
}
