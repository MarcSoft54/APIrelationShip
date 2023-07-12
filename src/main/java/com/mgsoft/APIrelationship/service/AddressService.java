package com.mgsoft.APIrelationship.service;

import com.mgsoft.APIrelationship.model.Address;
import com.mgsoft.APIrelationship.repository.AddressRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Iterable<Address> getAddress() {
        return addressRepository.findAll();
    }
}
