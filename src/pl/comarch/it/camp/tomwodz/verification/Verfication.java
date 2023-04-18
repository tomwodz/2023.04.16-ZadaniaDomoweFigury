package pl.comarch.it.camp.tomwodz.verification;

import java.util.Arrays;

public class Verfication {
    public static boolean verEquilateral(double[] figures) {
        Arrays.sort(figures);
        if (!(Arrays.stream(figures).sum() == figures.length * figures[0])) {
            return false;
        }
        return true;
    }

    public static boolean verIsosceles(double[] figures) {
        for (int i = 0; i < figures.length; i++) {
            int courent = 0;
            for (int j = 1; j < figures.length; j++) {
                if (figures[i] == figures[j] && i != j) {
                    courent++;
                    if (courent == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean verRectangle(double[] figures) {
        Arrays.sort(figures);
        if (figures[0] == figures[1] && figures[2] == figures[3]) {
            return true;
        }
        return false;
    }

    public static boolean verTriangleExists(double[] figures) {
        if (figures[0] < figures[1] + figures[2]
                && figures[1] < figures[0] + figures[2]
                && figures[2] < figures[0] + figures[1]) {
            return true;
        } else {
            System.out.println("Z podanych bokow nie da sie utworzyc trojkata");
        }
        ;
        return false;
    }
}
