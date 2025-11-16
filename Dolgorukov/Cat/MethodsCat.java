package ru.Dolgorukov.Cat;

public class MethodsCat {
    public void meowing(Meow... meowingObjects) {
        for (Meow obj : meowingObjects) {
            obj.meow();
        }
    }
}
