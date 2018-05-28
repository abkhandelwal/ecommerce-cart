package com.fi.ecommerce.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fi.ecommerce.cart.model.Cart;

@SpringBootApplication
public class CartApplication {

	@Bean
	public Cart cart() {
		return new Cart();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}
}
