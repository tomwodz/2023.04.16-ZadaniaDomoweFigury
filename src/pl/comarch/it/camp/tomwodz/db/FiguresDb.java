package pl.comarch.it.camp.tomwodz.db;

import pl.comarch.it.camp.tomwodz.figures.Figures;


public class FiguresDb {
    private Figures[] figures = new Figures[10];

    double[] tab = new double[7];

    public FiguresDb() {

        for (int i = 0; i < 10; i++) {
            this.figures[i] = new Figures(i, tab);
        }
    }

    public boolean setFigures(Figures figures) {
        for (Figures figure : this.figures) {
            if (figures.getId() == figure.getId()) {
                figure.setName(figures.getName());
                figure.setTab(figures.getTab());
                figure.setArea(figures.getArea());
                figure.setCircuit(figures.getCircuit());
                return true;
            }
        }
        return false;
    }

    public Figures[] getFigures() {
        return figures;
    }
}
