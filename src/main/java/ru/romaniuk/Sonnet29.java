package ru.romaniuk;

public class Sonnet29 implements Poem {
    private static String line = "va-na-jj-lal";

    public Sonnet29() {
    }

    @Override
    public void recite() {
        System.out.println(line);
    }
}
