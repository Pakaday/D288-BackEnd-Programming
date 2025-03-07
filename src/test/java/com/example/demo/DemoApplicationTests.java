package com.example.demo;

import entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void Customer () {
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setAddress("123 Main St");
		customer.setCreateDate("2021-01-01");
		customer.setCustomerFirstName("John");
		customer.setCustomerLastName("Doe");
		customer.setLastUpdate("2021-01-01");
		customer.setPhone("123-456-7890");
		customer.setPostalCode("12345");
		customer.setDivisionId(1);
	}

	@Test
	public void Vacation() {
		Vacation vacation = new Vacation();
		vacation.setVacationId(1);
		vacation.setCreateDate("2021-01-01");
		vacation.setDescription("This is a test");
		vacation.setImageUrl("http://www.example.com");
		vacation.setLastUpdate("2021-01-01");
		vacation.setTravelFarePrice(5.00);
		vacation.setVacationTitle("Test Vacation");
	}

	@Test
	public void CartItem() {
		CartItem cartItem = new CartItem();
		cartItem.setCartItemId(1);
		cartItem.setCreateDate("2021-01-01");
		cartItem.setLastUpdate("2021-01-01");
		cartItem.setCartId(1);
		cartItem.setVacationId(1);
	}

	@Test
	public void Cart() {
		Cart cart = new Cart();
		cart.setCartId(1);
		cart.setCreateDate("2021-01-01");
		cart.setLastUpdate("2021-01-01");
	}

	@Test
	public void Country() {
		Country country = new Country();
		country.setCountryId(1);
		country.setCountry("USA");
		country.setCreateDate("2021-01-01");
		country.setLastUpdate("2021-01-01");
	}

	@Test
	public void Division() {
		Division division = new Division();
		division.setDivisionId(1);
		division.setCountryId(1);
		division.setCreateDate("2021-01-01");
		division.setDivision("Test Division");
		division.setLastUpdate("2021-01-01");
	}

	@Test
	public void Excurision() {
		Excursion excursion = new Excursion();
		excursion.setExcursionId(1);
		excursion.setCreateDate("2021-01-01");
		excursion.setExcursionPrice(5.00);
		excursion.setExcursionTitle("Test Excursion");
		excursion.setImageUrl("http://www.example.com");
		excursion.setLastUpdate("2021-01-01");
		excursion.setVacationId(1);
	}


}
