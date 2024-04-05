package ca.sheridancollege.martmanu.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.martmanu.beans.Toothbrush;
import ca.sheridancollege.martmanu.services.ToothbrushService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BootStrap implements CommandLineRunner {

	private ToothbrushService toothbrushService;
	
	@Override
	public void run(String... args) throws Exception {
		
		Toothbrush t1 = Toothbrush.builder()
				.name("Electric")
				.price(10)
				.quantity(5)
				.employeeName("John")
				.build();
		
		Toothbrush t2 = Toothbrush.builder()
				.name("Manual")
				.price(3)
				.quantity(8)
				.employeeName("John")
				.build();

		Toothbrush t3 = Toothbrush.builder()
				.name("Kids")
				.price(5)
				.quantity(10)
				.employeeName("Sally")
				.build();

		Toothbrush t4 = Toothbrush.builder()
				.name("Travel")
				.price(7)
				.quantity(6)
				.employeeName("Bob")
				.build();

		Toothbrush t5 = Toothbrush.builder()
				.name("Soft Bristles")
				.price(4)
				.quantity(12)
				.employeeName("John")
				.build();

		Toothbrush t6 = Toothbrush.builder()
				.name("Medium Bristles")
				.price(4)
				.quantity(8)
				.employeeName("Sally")
				.build();

		Toothbrush t7 = Toothbrush.builder()
				.name("Charcoal Infused")
				.price(6)
				.quantity(10)
				.employeeName("Bob")
				.build();

		Toothbrush t8 = Toothbrush.builder()
				.name("Orthodontic")
				.price(8)
				.quantity(7)
				.employeeName("John")
				.build();

		Toothbrush t9 = Toothbrush.builder()
				.name("Gum Care")
				.price(6)
				.quantity(9)
				.employeeName("Sally")
				.build();

		Toothbrush t10 = Toothbrush.builder()
				.name("Sensitive")
				.price(5)
				.quantity(5)
				.employeeName("Bob")
				.build();

		toothbrushService.save(t1);
		toothbrushService.save(t2);
		toothbrushService.save(t3);
		toothbrushService.save(t4);
		toothbrushService.save(t5);
		toothbrushService.save(t6);
		toothbrushService.save(t7);
		toothbrushService.save(t8);
		toothbrushService.save(t9);
		toothbrushService.save(t10);
	}
}
