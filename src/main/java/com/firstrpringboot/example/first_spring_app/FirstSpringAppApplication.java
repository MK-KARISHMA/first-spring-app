package com.firstrpringboot.example.first_spring_app;

import com.firstrpringboot.example.first_spring_app.controller.DemoController;
import com.firstrpringboot.example.first_spring_app.controller.SampleController;
import com.firstrpringboot.example.first_spring_app.model.Address;
import com.firstrpringboot.example.first_spring_app.model.Employee;
import org.apache.tomcat.util.log.SystemLogHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.*;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello World, This is my first Spring Boot Application");

//
//		DemoController demoController = new DemoController();
//		demoController.getDemo1();
//		demoController.getDemo2();
//
//		SampleController sampleController = new SampleController();
//		sampleController.getSample1();
//		sampleController.getSample2();




















		// Dependency injection - loose coupling with setter injection\

//		Address adrs2 = new Address();
//		adrs2.setDoorNumber(1786);
//		adrs2.setStreetName("Karishma");
//		adrs2.setCity("tester");
//
//		Employee emp2 = new Employee();
//		emp2.setId(102);
//		emp2.setName("Karishma");
//		emp2.setEmail("karishma@gmail.com");
//		emp2.setDesignation("tester");
//		emp2.setAddress(adrs2);
//
//		System.out.println("Employee2 with Old Address: " + emp2);
//		System.out.println("Employee2 with Old Address: " + adrs2);
//
//		emp2.getAddress().setDoorNumber(101);    // Directly using the employee object to change the address hence Employee is not depend on Address
//		emp2.getAddress().setStreetName("Bazaar");
//		emp2.getAddress().setCity("Bangalore");
//
//		System.out.println("Employee2 with New Address: " + emp2);
//		System.out.println("Employee2 with New Address: " + adrs2);


		// Dependency injection - loose coupling with constructor injection

//		Address adrs3 = new Address(103, "old street", "old city");
//		Employee emp3 = new Employee(101, "Kempi", "abc@gmail.com", "software Engineer", adrs3);
//
//
//		System.out.println("Employee3 is : " + emp3);
//		System.out.println("Employee3 is : " + adrs3);
//
//		emp3.getAddress().setDoorNumber(475);
//		emp3.getAddress().setStreetName("Bazaar");
//		emp3.getAddress().setCity("Bangalore");
//		System.out.println("Employee3 with New Address: " + emp3);
//		System.out.println("Employee3 with New Address: " + adrs3);

//		 *******************************


		// tight coupling
//      Here Everything will be public but in Loose coupling everything will be private and using getter and setter to access it
//
//		Address adrs1 = new Address();
//		adrs1.doorNumber = 786;
//		adrs1.streetName = "Old Street";
//		adrs1.city = "Old City";
//
//		Employee emp1 = new Employee();
//		emp1.id = 101;
//		emp1.name = "Karishma MK";
//		emp1.email = "karishma@gamil.com";
//		emp1.designation = "Software Developer";
//		emp1.address = adrs1;
//		System.out.println("Employee1 with Old Address: " + emp1);
//		System.out.println("Employee1 with Old Address : " + adrs1);
//
//
//		// here we cannot manipulate the data using emp1 object instead we can use directly adrs1 object and update the data hence here employee is depend on the address object.
//		adrs1.doorNumber = 999;
//		adrs1.streetName = "New Street";
//		adrs1.city = "New City";
//		System.out.println("Employee1 with New Address: " + emp1);
//		System.out.println("Employee1 with New Address: " + adrs1);



	}

}
