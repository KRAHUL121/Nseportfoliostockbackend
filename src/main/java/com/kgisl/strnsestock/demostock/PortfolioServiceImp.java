package com.kgisl.strnsestock.demostock;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("portfolioService")
public class PortfolioServiceImp implements PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Override
    public List<Portfolio> getAll() {
     
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio save(Portfolio p) {
        
 

        return portfolioRepository.saveAndFlush(p);

    }

    // @Override
    // public Portfolio find(long id) {
       
    //     return portfolioRepository.findOne(id);
    // }

    // @Override
    // public void delete(String cat) {
       
    //     portfolioRepository.delete(cat);
    // }
    // @Override
    // public List<Portfolio> listtop(){
    //     return portfolioRepository.findAll().stream().limit(5).collect(Collectors.toList());
    // }
}