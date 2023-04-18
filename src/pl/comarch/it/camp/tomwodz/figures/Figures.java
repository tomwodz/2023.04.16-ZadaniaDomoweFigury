package pl.comarch.it.camp.tomwodz.figures;

import java.util.Arrays;

public class Figures {
    int id;
    String name;

    double[] tab;

    String area;
    String circuit;

    public Figures(int id, double[] tab) {
        this.id = id;
        this.tab = tab;
    }

    public Figures() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double[] getTab() {
        return this.tab;
    }

    public void setTab(double[] tab) {
        this.tab = tab;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public double circuit(double[] tab){
        return Arrays.stream(tab).sum();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.name)
                .append(" Boki: ")
                .append(Arrays.toString(tab))
                .append(" Area: ")
                .append(this.area)
                .append(" Circuit: ")
                .append(this.circuit)
                .toString();
    }
}
