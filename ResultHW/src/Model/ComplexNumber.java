package Model;

import Model.Interfaces.INumber;

public class ComplexNumber implements INumber<ComplexNumber> {
    private float a;
    private float b;

    public ComplexNumber(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public ComplexNumber add(ComplexNumber number){
        float newA = this.a + number.getA();
        float newB = this.b + number.getB();
        return new ComplexNumber(newA, newB);
    }

    public ComplexNumber multiply(ComplexNumber number){
        float newA = this.a * number.getA() - this.b * number.getB();
        float newB = this.a * number.getB() + this.b * number.getA();
        return new ComplexNumber(newA, newB);
    }

    public ComplexNumber divide(ComplexNumber number){
        float newA = (this.a * number.getA() + this.b * number.getB()) / (number.getA() * number.getA() + number.getB() * number.getB());
        float newB = (number.getA() * this.b - this.a * number.getB()) / (number.getA() * number.getA() + number.getB() * number.getB());
        return new ComplexNumber(newA, newB);
    }

    @Override
    public String toString(){
        return "(" + a + ") + (" + b + ")i";
    }
}
