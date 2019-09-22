package program;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveAdajcent {
    public static void main(String args[]) {
        //List<Integer> list = Arrays.asList(2,4,5,1,1,5,4,3);
        List<Integer> list = new LinkedList<Integer>(Arrays.asList(2,4,5,1,1,5,4,3));
        //List<Integer> list = new LinkedList<Integer>(Arrays.asList(2, 4, 5, 1, 1, 5, 4, 3, 4, 4, 3, 6, 7, 8));
        int length = list.size();
        int start1 = 0, start2 = 1;
        while (start1 < length && start2 < length) {
            int tmp1 = list.get(start1);
            int tmp2 = list.get(start2);
            while (tmp1 == -1 || tmp2 == -1) {
                if (tmp1 == -1) {
                    start1++;
                }
                if (tmp2 == -1) {
                    start2++;
                }
                tmp1 = list.get(start1);
                tmp2 = list.get(start2);
            }
            if (tmp1 == tmp2) {
                list.set(start1, -1);
                list.set(start2, -1);
                start1 = 0;
                start2 = 1;
            } else {
                start1++;
                start2++;
            }
        }

        for (start1 = 0; start1 < list.size(); start1++) {
            if (list.get(start1) != -1) {
                System.out.print(list.get(start1) + " ");
            }
        }


    }
}
