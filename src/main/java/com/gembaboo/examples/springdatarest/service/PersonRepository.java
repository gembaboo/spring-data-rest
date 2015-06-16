package com.gembaboo.examples.springdatarest.service;

import com.gembaboo.examples.springdatarest.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {

    List<Person> findByLastName(@Param("lastName") String lastName);

}
