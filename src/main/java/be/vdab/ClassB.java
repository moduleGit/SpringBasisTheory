package be.vdab;

public class ClassB implements InterfaceB {
	private final String telefoonNrHelpDesk;
	private final int aantalPogingenUpdateKlant;

	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}

	public int getAantalPogingenUpdateKlant() {
		return aantalPogingenUpdateKlant;
	}

	public ClassB(String telefoonNrHelpDesk, int aantalPogingenUpdateKlant) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
		this.aantalPogingenUpdateKlant = aantalPogingenUpdateKlant;
	}

	@Override
	public String getBoodschap() {
		return "een ClassB object";
	}
}
