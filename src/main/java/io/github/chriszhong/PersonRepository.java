package io.github.chriszhong;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Christopher Zhong
 * @version 1.0
 */
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
