package arrays_hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalUcgeni {
    public static void main(String[] args) {
        System.out.println("****************************2 yol************************************");
        Scanner al = new Scanner(System.in);
        System.out.println("Pascalucgeni kaç satır olsun");
        int sayi = al.nextInt();


        for (int i = 0; i < sayi; i++) {

            for (int bosluk = sayi; bosluk > i; bosluk--) {
                System.out.print("* ");
            }
            int num=1;
            for (int j =0; j<=i;j++) {
                System.out.print(" "+num+" ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
