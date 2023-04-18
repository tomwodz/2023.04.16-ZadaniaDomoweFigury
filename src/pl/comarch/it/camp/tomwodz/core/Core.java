package pl.comarch.it.camp.tomwodz.core;

import pl.comarch.it.camp.tomwodz.GUI.Gui;
import pl.comarch.it.camp.tomwodz.db.FiguresDb;
import pl.comarch.it.camp.tomwodz.figures.*;
import pl.comarch.it.camp.tomwodz.verification.*;

import java.util.Scanner;

public class Core {

    public static void start() {
        FiguresDb figuresDb = new FiguresDb();
        Scanner scanner = new Scanner(System.in);
        boolean runD = true;

        do {

            System.out.println("Podaj liczbe zestawow od 1 do 10: ");
            int n = Integer.parseInt(scanner.nextLine());

            if (n <= 10 && n > 0) {
                runD = false;

                System.out.println("Podaj " + n + " zestawow liczb:");
                for (int i = 0; i < n; i++) {
                    boolean run = true;
                    while (run) {

                        String userNumbers = scanner.nextLine();
                        String[] figuresText = userNumbers.split(" ");
                        double[] figures = CoreEx.coreEx(figuresText);

                        if (figuresText.length >= 1 && figuresText.length <= 6
                                && figuresText.length != 2) {

                            if (figuresText.length == 1) {
                                run = !(figuresDb.setFigures(new Kolo(i, figures)));
                            } else if (Verfication.verEquilateral(figures)) {
                                switch (figures.length) {
                                    case 3:
                                        run = !(figuresDb.setFigures(new TrojkatRownoBoczny(i, figures)));
                                        break;
                                    case 4:
                                        run = !(figuresDb.setFigures(new Kwadrat(i, figures)));
                                        break;
                                    case 5:
                                        run = !(figuresDb.setFigures(new PieciokatForemny(i, figures)));
                                        break;
                                    case 6:
                                        run = !(figuresDb.setFigures(new SzesciokatForemny(i, figures)));
                                        break;
                                    default:
                                }
                            } else if (!(Verfication.verEquilateral(figures))) {
                                switch (figures.length) {
                                    case 3:
                                        if (Verfication.verTriangleExists(figures)) {
                                            if (Verfication.verIsosceles(figures)) {
                                                run = !(figuresDb.setFigures(new TrojkatRownoRamienny(i, figures)));
                                            } else {
                                                run = !(figuresDb.setFigures(new TrojkatRoznoBoczny(i, figures)));
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (Verfication.verRectangle(figures)) {
                                            run = !(figuresDb.setFigures(new Prostokat(i, figures)));
                                        } else {
                                            run = !(figuresDb.setFigures(new Czworokat(i, figures)));
                                        }
                                        break;
                                    case 5:
                                        run = !(figuresDb.setFigures(new Pieciokat(i, figures)));
                                        break;
                                    case 6:
                                        run = !(figuresDb.setFigures(new Szesciokat(i, figures)));
                                        break;
                                    default:
                                }
                            }

                        } else {
                            System.out.println("Podaj odpowiednia ilosc bokow! 1 lub 3,4,5,6");
                        }
                    }
                }

            } else {
                System.out.println("Podaj liczbe zestawow od 1 do 10.");
            }

        } while (runD);

        Gui.showFigures(figuresDb.getFigures());
    }
}
