package shoppingcart.application_name.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shoppingcart.application_name.repository.ApplicationNameRepository;
import shoppingcart.application_name.model.ApplicationName;

@RestController
@CrossOrigin
public class ApplicationNameController {

    @Autowired
    ApplicationNameRepository applicationNameRepository;

    @RequestMapping("/application")
    public ApplicationName getName(){

        return applicationNameRepository.findAll().get(0);
    }
}
