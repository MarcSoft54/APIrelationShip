package com.mgsoft.APIrelationship.repository;

import com.mgsoft.APIrelationship.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    @Autowired
    Address address = new Address();

}
