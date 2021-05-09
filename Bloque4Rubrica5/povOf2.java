package Bloque4Rubrica5;

import java.util.ArrayList;
import java.util.List;

public class povOf2 {

    public static String povOf2 (int exp) {
        if (exp == 0) {
            return "0";
        }
        List<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        int size = 1;
        int tmp;
        int ac = 0;
        //First Loop
        for (int i = 0; i < exp; i++) {
            //Second Loop
            for (int j = 0; j < size; j++) {
                tmp = digits.get(j);
                tmp *= 2;
                tmp += ac;
                ac = 0;
                if (tmp > 9) {
                    tmp -= 10;
                    ac = 1;
                }
                digits.set(j, tmp);
            }

            //Second if
            if (ac == 1) {
                digits.add(ac);
                size++;
                ac = 0;
            }
        }

        String s = "";
        //Third Loop
        for (int i = digits.size() - 1; i >= 0; i--) {
            s += digits.get(i);
        }
        return s;
    }


}
