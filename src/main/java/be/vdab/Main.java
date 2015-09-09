package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.gaming.Spelletje;

public class Main {
	public static void main(String[] args) {
		/*
		 * try (AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext( CreateRestClientBeans.class,
		 * CreateServiceBeans.class)) {
		 * 
		 * System.out.println(context.getBean(EuroService.class).naarDollar(
		 * BigDecimal.valueOf(2))); }
		 */

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"container.xml")) {
			System.out.println(context.getBean(Spelletje.class)
					.getAantalVijanden());
		}
	}
}
