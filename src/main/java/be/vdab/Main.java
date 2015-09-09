package be.vdab;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.restclient.CreateRestClientBeans;
import be.vdab.services.CreateServiceBeans;
import be.vdab.services.EuroService;

public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CreateRestClientBeans.class, CreateServiceBeans.class)) {

			System.out.println(context.getBean(EuroService.class).naarDollar(
					BigDecimal.valueOf(2)));
		}

	}
}
