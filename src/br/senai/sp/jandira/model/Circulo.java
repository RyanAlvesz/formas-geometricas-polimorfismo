package br.senai.sp.jandira.model;

public class Circulo implements FormaGeometrica{

    double diametro, area, perimetro;

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public void calcularArea() {
        setArea(Math.PI * Math.pow((diametro/2), 2));
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(2 * Math.PI * (diametro/2));
    }
}
