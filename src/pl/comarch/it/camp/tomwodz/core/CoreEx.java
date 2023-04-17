package pl.comarch.it.camp.tomwodz.core;

public class CoreEx {
    public static double[] coreEx(String[] figuresText ){
        double[] figures = new double[figuresText.length];
        for (int j = 0; j < figures.length; j++) {
            figures[j] = Integer.parseInt(figuresText[j]);
        }
        return figures;
    }
}
