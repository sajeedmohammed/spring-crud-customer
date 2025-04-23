package com.infosys.customer.repository;

import com.infosys.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>
{

    //Customer is the entity class & Long is the type of primary key(id)
    //save(), findById(), deleteById(), findAll(), existsById(), and more methods u will have for this repo.
    //existsByEmail(String email) is a custom query method - spring understands it & creates the SQL behind the scenes
    //customer methods (optional)
    boolean existsByEmail(String email);


}
