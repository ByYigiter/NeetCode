package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination1 {
    static List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3,5,8));

    public static void main(String[] args) {
        System.out.println(list+ " Sayılarının Kombinasyonu ");
        for (int i = 0; i < list.size(); i++) {
            List<Integer> newlist = new ArrayList<Integer>();
            newlist.addAll(list);
            newlist.remove(list.get(i));
            changed(newlist, list.get(i));
        }
    }
    public static void changed(List<Integer> newlist, int i) {
        int geçici = 0;
        System.out.print(i + "" + newlist + "- ");
        for (int j = 1; j < newlist.size(); j++) {
            geçici = newlist.get(j - 1);
            newlist.set(j - 1, newlist.get(j));
            newlist.set(j, geçici);
            System.out.print(i + "" + newlist + "- ");
        }
        System.out.println();
    }
}
