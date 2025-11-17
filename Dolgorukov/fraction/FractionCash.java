package ru.Dolgorukov.fraction;

public class FractionCash implements Methods{
    private Fraction fraction;
    private Double cachedFraction;

    public FractionCash(Fraction fraction) {
        this.fraction = fraction;
        this.cachedFraction = null;
    }

    @Override
    public double getFractionFloat() {
        if (cachedFraction == null){
            this.cachedFraction = fraction.getFractionFloat();
        }
        return cachedFraction;
    }

    @Override
    public void setNumDen(int numerator, int denomenator) {
        fraction.setNumDen(numerator,denomenator);
        this.cachedFraction = null;
    }
}


