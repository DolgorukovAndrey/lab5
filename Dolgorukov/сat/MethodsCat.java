package ru.Dolgorukov.сat;

public class MethodsCat {
    public void meowing(Meow... meowingObjects) {
        for (Meow obj : meowingObjects) {
            obj.meow();
        }
    }
}
