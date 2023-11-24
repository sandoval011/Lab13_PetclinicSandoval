package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    // por nombre
    List<Owner> findByFirstName(String firstName);

    // por apellido
    List<Owner> findByLastName(String lastName);

    // por ciudad
    List<Owner> findByCity(String city);



}
