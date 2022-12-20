package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,15,12,55,11));
        List<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < list.size()/2; i++) {
            newList.add(list.get(i));
            newList.add(list.get(list.size()-1-i));
        }if(list.size()%2==1){
            newList.add(list.get(list.size()/2));
        }
        System.out.println(list);
        System.out.println(newList);
    }
}
