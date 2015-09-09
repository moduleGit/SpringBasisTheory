package be.vdab.restclient;

import java.net.URL;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:restclient.properties")
public class CreateRestClientBeans {
	@Value("${ecbKoersenURL}")
	private URL ecbURL;
	@Bean
	@Qualifier("ECB")
	KoersenClient ecbKoersenClient() {
		return new ECBKoersenClient(ecbURL);
	}

	@Value("${yahooKoersenURL}")
	private URL yahooURL;
	@Bean
	@Qualifier("Yahoo")
	KoersenClient yahooKoersenClient() {
		return new YahooKoersenClient(yahooURL);
	}
}