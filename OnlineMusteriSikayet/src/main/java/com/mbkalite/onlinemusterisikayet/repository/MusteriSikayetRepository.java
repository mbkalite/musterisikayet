package com.mbkalite.onlinemusterisikayet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mbkalite.onlinemusterisikayet.entity.MusteriSikayet;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "musteriSikayet", path = "musteri-sikayet")
public interface MusteriSikayetRepository extends JpaRepository<MusteriSikayet, Long>{

}
