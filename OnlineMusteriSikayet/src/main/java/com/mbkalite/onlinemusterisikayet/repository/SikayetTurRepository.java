package com.mbkalite.onlinemusterisikayet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mbkalite.onlinemusterisikayet.entity.SikayetTur;

@RepositoryRestResource(collectionResourceRel = "sikayetTur", path = "sikayet-tur")
public interface SikayetTurRepository extends JpaRepository<SikayetTur, Long>{

}
