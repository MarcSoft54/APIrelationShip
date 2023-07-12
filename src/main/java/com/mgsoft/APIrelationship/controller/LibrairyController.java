package com.mgsoft.APIrelationship.controller;

import com.mgsoft.APIrelationship.model.Librairy;
import com.mgsoft.APIrelationship.service.LibrairyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class LibrairyController {

    @Autowired
    public LibrairyService librairyService;

    @GetMapping(path = "/librairie")
    public Iterable<Librairy> getLibrairies(){
        return  librairyService.getLibrairie();
    }
}
