package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationV2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> xlist = new ArrayList<Integer>();

        int[][] arr = new int[list.size() * (list.size() - 1)][list.size()];
        int x = 0;
        int y = 0;
        for (int i = 0; i < (list.size() * (list.size() - 1)); i++) {

            if (y != 0 && y % (list.size() - 1) == 0) //ilk elemanı kaç kere yazacak kontrol: listin eleman sayısının bir eksiği kadar aynı elemanı tekrarlayacak
                x++;                                //ilk elemaın index değişimi
            arr[i][0] = list.get(x);

            if (y % (list.size() - 1) == 0) {  //   ilk elemandan sonrakileri ayrı bir liste almak için kontrol: birinci elemanı ilk aldığında listeyi alır
                xlist.clear();

                for (int j = 0; j < list.size(); j++) {
                    if (j != x) {
                        xlist.add(list.get(j));     //ilk elemandan sonrakileri başka bir xlist'e aldık
                    }
                }
                // System.out.println(xlist);
            }
            for (int k = 0; k < xlist.size(); k++) {
                arr[i][k + 1] = xlist.get(k);      //ilk elemandan sonrakileri arraya yazdırdık

            }
            y++;
            xlist.add(0,xlist.get(xlist.size()-1 ));
            xlist.remove(xlist.size()-1 );      // xlisteki elemanları yer değiştirdik



        }
        System.out.println(Arrays.deepToString(arr));

    }
}
