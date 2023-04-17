package pl.comarch.it.camp.tomwodz.verification;

import java.util.Arrays;

public class VerSzesciokat {
    public static int VerSzesciokat  (double[] figures) {
        if (figures[0] > 0 && figures[1] > 0
                && figures[2] > 0 && figures[3] > 0
                && figures[4] > 0 && figures[5] > 0) {
            if (Arrays.stream(figures).sum() == figures.length * figures[0]) // foremny
            {
                return 1;
            }
            else { return 2;}
        }
        System.out.println("Z podanych bokow nie da sie utworzyc czworokata");
        return 0;
    }
}
