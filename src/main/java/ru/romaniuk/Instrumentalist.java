package ru.romaniuk;

public class Instrumentalist implements Performer {
	private Instrument indtrumet;
	private String song;

	public Instrumentalist() {
	}

	public Instrument getIndtrumet() {
		return indtrumet;
	}

	public void setIndtrumet(Instrument indtrumet) {
		this.indtrumet = indtrumet;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String screamSong() {
		return song;
	}
	@Override
	public void perform() throws PerformerEcxeption {
		System.out.println("Playing " + song);
		indtrumet.play();
	}
}
