package br.com.cristiano.souza.personapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cristiano.souza.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
