package pl.comarch.it.camp.tomwodz.verification;

import java.util.Arrays;

public class VerCzworokat {
    public static int VerCzworokat(double[] figures) {
        if (figures[0] > 0 && figures[1] > 0 && figures[2] > 0 && figures[3] > 0) {
            Arrays.sort(figures); //prostokat*
            if (Arrays.stream(figures).sum() == figures.length * figures[0]) // kwadrat
            {
                return 1;
            } else if (figures[0] == figures[1] && figures[2] == figures[3]) { //prostokat*
                return 2;
            }
            else  { return 3;}
        }
        System.out.println("Z podanych bokow nie da sie utworzyc czworokata");
        return 0;
    }
}
