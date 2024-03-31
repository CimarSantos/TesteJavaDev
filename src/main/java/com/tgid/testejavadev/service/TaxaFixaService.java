package com.tgid.testejavadev.service;

import org.springframework.stereotype.Service;

@Service
public class TaxaFixaService implements TaxaService {
    
    @Override
    public double calcularTaxa() {
        return 5.0;
    }
}
