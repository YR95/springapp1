package ru.romaniuk;

public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Classic";
    }

    private ClassicMusic() {
    }

    public static ClassicMusic getClassicalMusic() {
        System.out.println("factory creating");
        return new ClassicMusic();
    }

    public void doInitMethod() {
        System.out.println("Init classic ");
    }

    public void destroyMethod() {
        System.out.println("Destroy classic");
    }
}
