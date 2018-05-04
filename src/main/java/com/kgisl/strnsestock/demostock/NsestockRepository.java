package com.kgisl.strnsestock.demostock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("nsestockRepository")
public interface NsestockRepository extends JpaRepository<Nsestock, Long> {
    

}