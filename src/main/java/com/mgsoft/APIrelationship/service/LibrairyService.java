package com.mgsoft.APIrelationship.service;

import com.mgsoft.APIrelationship.model.Librairy;
import com.mgsoft.APIrelationship.repository.LibrairyRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class LibrairyService {

    @Autowired
    private LibrairyRepository librairyRepository;

    public Iterable<Librairy> getLibrairie(){
        return librairyRepository.findAll();
    }

    public Librairy createLibrairy(Librairy librairy){
        Librairy lib= librairyRepository.save(librairy);
    return lib;
    }


}
