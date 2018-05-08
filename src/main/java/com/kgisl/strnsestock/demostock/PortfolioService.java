package com.kgisl.strnsestock.demostock;

import java.util.List;



public interface PortfolioService {

    public List<Portfolio> getAll();

    public Portfolio save(Portfolio portfolio);

    // public Portfolio find(long id);

    // public void delete(String cat);

    // public List<Portfolio> listtop();

}