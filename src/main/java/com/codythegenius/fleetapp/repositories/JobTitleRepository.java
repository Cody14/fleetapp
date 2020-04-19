package com.codythegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codythegenius.fleetapp.models.JobTitle;
@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
