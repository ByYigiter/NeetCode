package math_Geometry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        System.out.println("Bir sayı Giriniz : ");
        int num = al.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = num; i > 0; i /= 10) {
            list.add(0, i % 10);
        }
        //System.out.println(list);
        List<Integer> ondalık = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ondalık.add((int) (list.get(i) * (Math.pow(10, (list.size()) - 1 - i))));
        }
        //System.out.println(ondalık);

        for (int i = 0; i < ondalık.size(); i++) {
            if (ondalık.get(i) > 999 && ondalık.get(i) < 10000) {
                if (ondalık.get(i) > 4000) {
                    if (ondalık.get(i) == 5000) {
                        System.out.print(" V'");
                    } else if (ondalık.get(i) == 9000) {
                        System.out.print("MV'");
                    } else {
                        System.out.print("V'");
                        for (int j = 6; j <= list.get(i); j++) {
                            System.out.print("M");
                        }
                    }
                } else {
                    if (ondalık.get(i) == 4000) {
                        System.out.print("MV'");
                    } else {

                        for (int j = 0; j < list.get(i); j++) {
                            System.out.print("M");
                        }
                    }

                }
            }
            else if (ondalık.get(i) > 99 && ondalık.get(i) < 1000) {
                if (ondalık.get(i) > 400) {
                    if (ondalık.get(i) == 500) {
                        System.out.print("D");
                    } else if (ondalık.get(i) == 900) {
                        System.out.print("CM");
                    } else {
                        System.out.print("D");
                        for (int j = 6; j <= list.get(i); j++) {
                            System.out.print("C");
                        }
                    }
                } else {
                    if (ondalık.get(i) == 400) {
                        System.out.print("CD");
                    } else {

                        for (int j = 0; j < list.get(i); j++) {
                            System.out.print("C");
                        }
                    }

                }
            }
            else if (ondalık.get(i) > 9 && ondalık.get(i) < 100) {
                if (ondalık.get(i) > 40) {
                    if (ondalık.get(i) == 50) {
                        System.out.print("L");
                    } else if (ondalık.get(i) == 90) {
                        System.out.print("XC");
                    } else {
                        System.out.print("L");
                        for (int j = 6; j <= list.get(i); j++) {
                            System.out.print("X");
                        }
                    }
                } else {
                    if (ondalık.get(i) == 40) {
                        System.out.print("XL");
                    } else {

                        for (int j = 0; j < list.get(i); j++) {
                            System.out.print("X");
                        }
                    }

                }
            }
            else if (ondalık.get(i) > 0 && ondalık.get(i) < 10) {
                if (ondalık.get(i) > 4) {
                    if (ondalık.get(i) == 5) {
                        System.out.println("V");
                    } else if (ondalık.get(i) == 9) {
                        System.out.println("IX");
                    } else {
                        System.out.print("V");
                        for (int j = 6; j <= list.get(i); j++) {
                            System.out.print("I");
                        }
                    }
                } else {
                    if (ondalık.get(i) == 4) {
                        System.out.print("IV");
                    } else {
                        for (int j = 0; j < list.get(i); j++) {
                            System.out.print("I");
                        }
                    }
                }
            }
        }
    }
}

