package pl.comarch.it.camp.tomwodz.GUI;

import pl.comarch.it.camp.tomwodz.figures.Figures;

import java.util.Arrays;

public class Gui {
    public static void showFigures(Figures[] figures){

        for (Figures figure : figures) {
            if (figure.getName() != null) {
                System.out.println(figure);
            }
        }
    }
}
