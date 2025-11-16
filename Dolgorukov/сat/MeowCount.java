package ru.Dolgorukov.сat;

public class MeowCount implements Meow {
    private final Cat cat;
    private int countMeow;

    public MeowCount(Cat cat) {
        this.cat = cat;
        this.countMeow = 0;
    }

    public int getCaountMeow() {
        return this.countMeow;
    }

    public String getCatName() {
        return cat.getName();
    }

    @Override
    public void meow() {
        cat.meow();
        this.countMeow++;
    }
}
