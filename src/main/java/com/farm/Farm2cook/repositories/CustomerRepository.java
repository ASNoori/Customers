package com.farm.Farm2cook.repositories;
import com.farm.Farm2cook.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
