package com.eis.in.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eis.in.Entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {

}
