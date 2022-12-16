package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
    static  List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,15,18,20));

    public static void main(String[] args) {  //
        int change = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            //System.out.print(list.get(list.size()-1));
            List<Integer> newlist = new ArrayList<Integer>();
            newlist.addAll(list);
            newlist.remove(list.get(i));
            //System.out.print(list.get(i)+"");
            changed(newlist,list.get(i));
        }



    }
    public static void changed(List<Integer> newlist ,int i) {
        int[]multi = new int[list.size()*(list.size())-1];
        int []arr = new int[newlist.size()];
            for (int j = 0; j < arr.length; j++) {
            arr[j] = newlist.get(j);
        }

        int geçici=0;


        System.out.print(i+Arrays.toString(arr)+"- ");
        for (int j = 1; j <arr.length; j++){
            geçici=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=geçici;
            System.out.print(i+Arrays.toString(arr)+"- ");
        }
       System.out.println();
    }
}
