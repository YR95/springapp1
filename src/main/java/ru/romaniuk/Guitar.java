package ru.romaniuk;

public class Guitar implements Instrument {
	public Guitar() {
	}

	@Override
	public void play() {
		System.out.println("plating guitar");
	}
}
