package br.senai.sp.jandira.model;

public class Retangulo implements FormaGeometrica {

    private double l1, l2, perimetro, area;

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro((l1 * 2) + (l2 * 2));
    }

    @Override
    public void calcularArea() {
        setArea(l1 * l2);
    }

}
