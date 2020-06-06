package sample.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.example.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
