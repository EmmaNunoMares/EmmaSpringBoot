package com.springbootfive.emmaSpringBootPractice.repositories;


import com.springbootfive.emmaSpringBootPractice.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
