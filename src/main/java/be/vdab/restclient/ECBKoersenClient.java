package be.vdab.restclient;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
//@Qualifier("ECB")	
public class ECBKoersenClient implements KoersenClient {
	private final URL url;

	@Autowired
	public ECBKoersenClient(/*@Value("${ecbKoersenURL}")*/ URL url) {
	this.url = url;
	}

	@Override
	public BigDecimal getDollarKoers() {
		try (Scanner xmlScanner = new Scanner(url.openStream())) {
			String regel;
			// regel per regel lezen tot we een regel vinden die USD bevat:
			while (!(regel = xmlScanner.nextLine()).contains("USD"))
				;
			try (Scanner regelScanner = new Scanner(regel)) { // in de regel
																// zelf lezen
				regelScanner.findInLine("rate='"); // tekens overslaan tot en
													// met rate='
				regelScanner.useDelimiter("'"); // volgende leesoperatie tot
												// voor komma
				return new BigDecimal(regelScanner.next());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}