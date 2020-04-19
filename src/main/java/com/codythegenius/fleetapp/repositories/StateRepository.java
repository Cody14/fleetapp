package com.codythegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codythegenius.fleetapp.models.State;
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
