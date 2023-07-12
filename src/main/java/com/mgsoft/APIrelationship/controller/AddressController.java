package com.mgsoft.APIrelationship.controller;

import com.mgsoft.APIrelationship.model.Address;
import com.mgsoft.APIrelationship.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address")
    public Iterable<Address> getMyAddress(){
        return addressService.getAddress();
    }

}
