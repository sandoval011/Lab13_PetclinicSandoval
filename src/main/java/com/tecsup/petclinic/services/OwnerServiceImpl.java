package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;
import com.tecsup.petclinic.repositories.OwnerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {

    private static final Logger logger = LoggerFactory.getLogger(OwnerServiceImpl.class);
    @Autowired
    OwnerRepository ownerRepository;

    @Override
    public Owner create(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner update(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Long id) throws OwnerNotFoundException {
        Owner owner = findById(id);
        ownerRepository.delete(owner);
    }

    @Override
    public Owner findById(long id) throws OwnerNotFoundException {
        Optional<Owner> owner = ownerRepository.findById(id);

        if (!owner.isPresent())
            throw new OwnerNotFoundException("Owner not found...!");

        return owner.get();
    }

    @Override
    public List<Owner> findByFirstName(String firstName) {
        return ownerRepository.findByFirstName(firstName);
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findByCity(String city) {
        return ownerRepository.findByCity(city);
    }

    @Override
    public List<Owner> findAll() {
        return (List<Owner>) ownerRepository.findAll();
    }
}
