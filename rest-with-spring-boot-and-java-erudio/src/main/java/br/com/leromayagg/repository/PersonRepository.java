package br.com.leromayagg.repository;

import br.com.leromayagg.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
