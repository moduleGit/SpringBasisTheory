package be.vdab.gaming;

import org.springframework.beans.factory.annotation.Value;

public class Spelletje {
	@Value("#{${minimumAantalVijanden} + new java.util.Random().nextInt(2)}")
	 private int aantalVijanden;

	public int getAantalVijanden() {
		return aantalVijanden;
	}

	public void setAantalVijanden(int aantalVijanden) {
		this.aantalVijanden = aantalVijanden;
	}
	 
}
