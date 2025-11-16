package ru.Dolgorukov.Cat;

public class MeowCount implements Meow {
    private final Cat cat;
    private int countMeow = 0;

    public MeowCount(Cat cat) {
        this.cat = cat;
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
