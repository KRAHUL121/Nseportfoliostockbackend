package com.kgisl.strnsestock.demostock;

import java.util.List;



public interface NsestockService {

    public List<Nsestock> getAll();

    public Nsestock save(Nsestock nsestock);

    public Nsestock find(long id);

    public void delete(Long id);

  

}