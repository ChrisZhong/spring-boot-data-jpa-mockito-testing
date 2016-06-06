package io.github.chriszhong;

import org.springframework.stereotype.Component;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@Component
public class SomeBean {
    public void doSomething(final PersonEntity personEntity) {
        personEntity.setName("Chris");
    }
}
