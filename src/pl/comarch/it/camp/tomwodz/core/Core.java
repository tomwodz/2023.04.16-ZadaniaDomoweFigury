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

                        if (figuresText.length == 1) {
                            Kolo kolo = new Kolo(i, figures);
                            run = !(figuresDb.setFigures(kolo));
                        } else if (figuresText.length == 3) {
                            int v = VerTrojkat.verTrojkat(figures);
                            if (v == 1) {
                                TrojkatRownoBoczny trojkat = new TrojkatRownoBoczny(i, figures);
                                run = !(figuresDb.setFigures(trojkat));
                            } else if (v == 2) {
                                TrojkatRownoRamienny trojkat = new TrojkatRownoRamienny(i, figures);
                                run = !(figuresDb.setFigures(trojkat));
                            } else if (v == 3) {
                                TrojkatRoznoBoczny trojkat = new TrojkatRoznoBoczny(i, figures);
                                run = !(figuresDb.setFigures(trojkat));
                            }
                        } else if (figuresText.length == 4) {
                            int v = VerCzworokat.VerCzworokat(figures);
                            if (v == 1) {
                                Kwadrat kwadrat = new Kwadrat(i, figures);
                                run = !(figuresDb.setFigures(kwadrat));
                            } else if (v == 2) {
                                Prostokat prostokat = new Prostokat(i, figures);
                                run = !(figuresDb.setFigures(prostokat));
                            } else if (v == 3) {
                                Czworokat prostokat = new Czworokat(i, figures);
                                run = !(figuresDb.setFigures(prostokat));
                            }
                        } else if (figuresText.length == 5) {
                            int v = VerPieciokat.VerPieciokat(figures);
                            if (v == 1) {
                                PieciokatForemny pieciokatForemny = new PieciokatForemny(i, figures);
                                run = !(figuresDb.setFigures(pieciokatForemny));
                            } else if (v == 2) {
                                Pieciokat pieciokat = new Pieciokat(i, figures);
                                run = !(figuresDb.setFigures(pieciokat));
                            }
                        } else if (figuresText.length == 5) {
                            int v = VerSzesciokat.VerSzesciokat(figures);
                            if (v == 1) {
                                SzesciokatForemny szesciokatForemny = new SzesciokatForemny(i, figures);
                                run = !(figuresDb.setFigures(szesciokatForemny));
                            } else if (v == 2) {
                                Szesciokat pieciokat = new Szesciokat(i, figures);
                                run = !(figuresDb.setFigures(pieciokat));
                            }
                        } else if ((figuresText.length < 3 || figuresText.length > 7)) {
                            System.out.println("Podaj odpowiednia dlugosc bokow!");
                        } else {
                            run = false;
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
