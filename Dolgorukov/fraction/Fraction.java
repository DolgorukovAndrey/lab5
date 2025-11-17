package ru.Dolgorukov.fraction;

import java.util.Objects;

public class Fraction implements Cloneable, Methods{
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalStateException("Ошибка деления на 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalStateException("Ошибка деления на 0");
        } else {
            if (denominator < 0) {
                this.denominator = denominator;
                this.numerator *= (-1);

            } else {
                this.denominator = denominator;
            }
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    @Override
    public Fraction clone() {
        try {
            return (Fraction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setNumDen(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть 0");
        }
        this.numerator = numerator;
        if (denominator < 0) {
            this.denominator = denominator;
            this.numerator *= (-1);

        } else {
            this.denominator = denominator;
        }
    }

    public double getFractionFloat() {
        return (double) this.numerator / this.denominator;
    }

    public String toString() {
        if (numerator != 0 && denominator != 0) {
            return numerator + "/" + denominator;
        } else {
            return "0";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Fraction fraction = (Fraction) obj;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}