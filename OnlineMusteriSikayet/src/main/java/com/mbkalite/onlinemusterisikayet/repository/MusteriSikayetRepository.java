package com.mbkalite.onlinemusterisikayet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mbkalite.onlinemusterisikayet.entity.MusteriSikayet;

@RepositoryRestResource(collectionResourceRel = "musteriSikayet", path = "musteri-sikayet")
public interface MusteriSikayetRepository extends JpaRepository<MusteriSikayet, Long>{

}
