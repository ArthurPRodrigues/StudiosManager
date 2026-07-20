package com.studiomanager.studio_apartment_manager;

import org.springframework.boot.SpringApplication;

public class TestStudioApartmentManagerApplication {

	public static void main(String[] args) {
		SpringApplication.from(StudioApartmentManagerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
