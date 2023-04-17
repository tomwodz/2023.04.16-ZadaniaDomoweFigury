package pl.comarch.it.camp.tomwodz.verification;

public class VerTrojkat {
    public static int verTrojkat(double[] figures) {
        if (figures[0] > 0 && figures[1] > 0  && figures[2] > 0){
            if (figures[0] == figures[1] && figures[1] == figures[2]) {
                return 1;
            } else if ((figures[0] == figures[1] && figures[1] != figures[2])
                    || (figures[1] == figures[2] && figures[1] != figures[0]
                    || (figures[0] == figures[2] && figures[0] != figures[1])
            )) {
                return 2;
            } else if (figures[0] < figures[1] + figures[2]
                    && figures[1] < figures[0] + figures[2]
                    && figures[2] < figures[0] + figures[1]) {
                return 3;
            }
        }
        System.out.println("Z podanych bokow nie da sie utworzyc trojkata");
        return 0;
    }
}
