package ru.romaniuk;

public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Classic";
    }

    public void doInitMethod() {
        System.out.println("Init classic ");
    }

    public void destroyMethod()
    {
        System.out.println("Destroy classic");
    }
}
