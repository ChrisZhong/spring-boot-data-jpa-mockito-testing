package io.github.chriszhong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final SomeBean someBean;

    @Inject
    protected PersonService(final PersonRepository personRepository, final SomeBean someBean) {
        this.personRepository = personRepository;
        this.someBean = someBean;
    }

    @Transactional
    public PersonEntity doSomething() {
        final PersonEntity personEntity = new PersonEntity();
        someBean.doSomething(personEntity);
        return personRepository.save(personEntity);
    }
}
