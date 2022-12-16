package arrays_hashing;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalUcgeni2 {
    public static void main(String[] args) {
        NumberFormat numberFormat = new DecimalFormat("###");
        Scanner al = new Scanner(System.in);
        System.out.println("Pascalucgeni kaç satır olsun");
        int sayi = al.nextInt();
        int[][] pascal = new int[sayi][];
        //System.out.println(Arrays.deepToString(pascal));
        for (int i = 0; i < pascal.length; i ++) {
            for (int bosluk = sayi; bosluk > i; bosluk--) {
                System.out.print("  ");
            }
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            for (int j = 1; j < i; j ++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];// 0-1-2 satırda : pascal[2][1] = pascal[1][0] (1) + pascal[1][1] (1) =  1 2 1
            }                                                          //      3 satırda : pascal[3][1] = pascal[2][0] (1) + pascal[2][1] (2) = 1 3
                                                                       //      3 satırda : pascal[3][2] = pascal[2][1] (2) + pascal[2][2] (1) = 1 3 3
            pascal[i][i] = 1;                                          //      3 satırda : pascal[3][3] = 1                         = 1 3 3 1
            System.out.println(Arrays.toString(pascal[i]));

        }
    }
}
