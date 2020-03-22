package com.springbootfive.emmaSpringBootPractice.repositories;


import com.springbootfive.emmaSpringBootPractice.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
