package com.fi.ecommerce.cart.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fi.ecommerce.cart.model.Cart;

public interface Repository extends CrudRepository<Cart, String>{
	
	@Query("{ 'username': ?0, '_id': ?0 }")
	Cart findByUsernameAndId(String username,String Id);
	
	//@Query("{'_id': ?0 }")
	//Cart findById(String id);

}
