package arrays_hashing;

import java.util.*;

public class GrupAnagram {
    public static void main(String[] args) {
        String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(Arrays.toString(arr));
        System.out.println("Grup Anagram");
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        String[] brr = new String[6];
        String str = "";
        String str2 = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            str = arr[i];
            for (int j = 0; j < arr.length; j++) {
                str2 = arr[j];
                for (int k = 1; k <= str2.length(); k++) {
                    if (str.contains(str2.substring(k - 1, k))) {
                        count++;
                    }
                }
                if (count == 3) {
                    list.add(str2);
                }
                count = 0;
            }

            brr[i] = String.valueOf(list);
            list2.add(brr[i]);
            list.clear();
        }
        Set<String> set = new HashSet<String>();
        set.addAll(list2);
        //System.out.println(list2);
        System.out.println(set);
    }
}
