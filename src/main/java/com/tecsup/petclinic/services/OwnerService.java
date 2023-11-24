package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

import java.util.List;

public interface OwnerService {

    Owner create(Owner owner);

    Owner update(Owner owner);

    void delete(Long id) throws OwnerNotFoundException;

    Owner findById(long id) throws OwnerNotFoundException;

    List<Owner> findByFirstName(String firstName);

    List<Owner> findByLastName(String lastName);

    List<Owner> findByCity(String city);

    Iterable<Owner> findAll();
}
