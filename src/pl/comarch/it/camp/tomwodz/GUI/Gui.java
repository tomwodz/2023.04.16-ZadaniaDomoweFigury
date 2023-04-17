package pl.comarch.it.camp.tomwodz.GUI;

import pl.comarch.it.camp.tomwodz.figures.Figures;

import java.util.Arrays;

public class Gui {
    public static void showFigures(Figures[] figures){

        for (Figures figure : figures) {
           // System.out.println(figure);
            if(figure.getName() != null) {
                System.out.println(new StringBuilder()
                        .append("Nazwa: ")
                        .append(figure.getName())
                        .append(" Boki / promien: ")
                        .append(Arrays.toString(figure.getTab()))
                        .append(" Area: ")
                        .append(figure.getArea())
                        .append(" Circuit: ")
                        .append(figure.getCircuit())
                        .toString());
            }
        }
    }
}
