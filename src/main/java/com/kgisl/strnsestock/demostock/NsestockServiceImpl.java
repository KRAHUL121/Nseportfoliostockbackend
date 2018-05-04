package com.kgisl.strnsestock.demostock;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("nsestockservice")
public class NsestockServiceImpl implements NsestockService {

    @Autowired
    private NsestockRepository nsestockRepository;

    @Override
    public List<Nsestock> getAll() {
     
        return nsestockRepository.findAll();
    }

    @Override
    public Nsestock save(Nsestock event) {
        
 

        return nsestockRepository.saveAndFlush(event);

    }

    @Override
    public Nsestock find(long id) {
       
        return nsestockRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
       
        nsestockRepository.delete(id);
    }
 
}