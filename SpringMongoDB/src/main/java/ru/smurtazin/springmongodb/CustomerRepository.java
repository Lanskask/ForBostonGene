package ru.smurtazin.springmongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by a1 on 14.03.17.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}