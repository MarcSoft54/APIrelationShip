package com.mgsoft.APIrelationship.repository;

import com.mgsoft.APIrelationship.model.Librairy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrairyRepository extends CrudRepository<Librairy, Long> {

    @Autowired
    Librairy librairy = new Librairy();
}
