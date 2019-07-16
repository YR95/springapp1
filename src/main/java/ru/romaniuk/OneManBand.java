package ru.romaniuk;

import java.util.Collection;

public class OneManBand implements Performer {
	private Collection<Instrument> instruments;

	public OneManBand() {
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() {
		for (Instrument i : instruments) {
			i.play();
		}
	}
}

