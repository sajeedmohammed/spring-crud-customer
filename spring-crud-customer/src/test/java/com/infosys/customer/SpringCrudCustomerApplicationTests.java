package com.infosys.customer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.profiles.active=test")  // Activate 'test' profile
public class SpringCrudCustomerApplicationTests {

	@Test
	void contextLoads() {
		// This will load the application context using the 'test' profile
	}
}