package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"container.xml")) {	
			ClassA objectA = context.getBean(ClassA.class);
			System.out.println(objectA.getKoersenURL());
			System.out.println(objectA.getDefaultTaalEnLand().getDisplayName());
			System.out.println("Bestand bestaat: " + objectA.getImportData().exists());
			System.out.println(objectA.getDefaultBladRichting());
			
			ClassB objectB = context.getBean(ClassB.class);
			System.out.println(objectB.getTelefoonNrHelpDesk());
			System.out.println(objectB.getAantalPogingenUpdateKlant());
			
			System.out.println(context.getBean(HelpdeskMedewerkers.class));
			
			System.out.println(context.getBean(ClassA.class).getWebMasterEMailAdres());
			System.out.println(context.getBean(ClassA.class).getWebsiteGestart());
			
		/*	context.getBean("teller1", Teller.class).verhoog(); 
			context.getBean("teller1", Teller.class).verhoog(); 
			Teller teller2 = context.getBean("teller2", Teller.class); 
			teller2.verhoog(); 
			context.getBean("teller2", Teller.class).verhoog();*/
		}
			
	}
}
