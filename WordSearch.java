package backtracking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        String str ="";
        String[][]words= {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        for (int i=0; i<words.length; i++) {
            System.out.print(Arrays.toString(words[i])+"--");
            for (int j=0; j<words[i].length; j++) {
                System.out.print(words[i][j]);
                str+=words[i][j];
            }
            System.out.println();
        }
        System.out.println(str);
        String str2[]=str.split("");
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (String w:str2) {
            if(map.get(w)==null){  // map.get(w)==null){   if (!map.containsKey(w))
                map.put(w,1);
            }else {
                map.put(w,map.get(w)+1);
            }
        }
        System.out.println(map);
        Scanner al = new Scanner(System.in);
        System.out.println("Aradığınız Kelimeleri Giriniz : ");
        String word =al.next().toUpperCase();
        String word2[] = word.split("");
        Map<String,Integer> map2 = new HashMap<String,Integer>();
        for (String w:word2) {
            if(map2.get(w)==null){  // map.get(w)==null){   if (!map.containsKey(w))
                map2.put(w,1);
            }else {
                map2.put(w,map2.get(w)+1);
            }
        }
        boolean durum=true;
        System.out.println(map2);
        //System.out.println(map.get("A") +"---" +map2.get("A"));
        for (String w:word2) {
            if (map.containsKey(w)) {
                if (map.get(w)>=map2.get(w)) {

                }else {
                    durum =false;
                break;}

            }else {
                System.out.println("aradığın harf yok");
                durum=false;
            }
        }
        System.out.println(durum);
    }
}
