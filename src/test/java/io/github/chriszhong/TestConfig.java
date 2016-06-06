package io.github.chriszhong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.mockito.Mockito.mock;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
@Configuration
public class TestConfig {

    private static final Logger logger = LoggerFactory.getLogger(TestConfig.class);

    @Bean
    @Profile("mock-some-bean")
    public SomeBean someBean() {
        logger.info("Mocking: {}", SomeBean.class);
        return mock(SomeBean.class);
    }

    @Bean
    @Profile("mock-person-repository")
    public PersonRepository personRepository() {
        logger.info("Mocking: {}", PersonRepository.class);
        return mock(PersonRepository.class);
    }
}
