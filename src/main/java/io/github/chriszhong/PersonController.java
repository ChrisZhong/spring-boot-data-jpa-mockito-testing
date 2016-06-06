package io.github.chriszhong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@RestController
@RequestMapping(path = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {

    private final PersonService personService;

    @Inject
    protected PersonController(final PersonService personService) {this.personService = personService;}

    @RequestMapping(method = RequestMethod.GET)
    public PersonEntity doSomething() {
        return personService.doSomething();
    }

}
