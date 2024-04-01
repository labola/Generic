package org.example;

public class Box<S,I,F> {
    private S string;
    private I numberInt;
    private F numberFloat;

    public Box(S string, I numberInt, F numberFloat) {
        this.string = string;
        this.numberInt = numberInt;
        this.numberFloat = numberFloat;
    }

    public S getString() {
        return string;
    }

    public void setString(S string) {
        this.string = string;
    }

    public I getNumberInt() {
        return numberInt;
    }

    public void setNumberInt(I numberInt) {
        this.numberInt = numberInt;
    }

    public F getNumberFloat() {
        return numberFloat;
    }

    public void setNumberFloat(F numberFloat) {
        this.numberFloat = numberFloat;
    }
}
