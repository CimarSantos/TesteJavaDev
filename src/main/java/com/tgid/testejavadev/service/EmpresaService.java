package com.tgid.testejavadev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgid.testejavadev.model.Empresa;

@Service
public class EmpresaService {
    
    @Autowired
    private TaxaService taxaService;
    
    public TaxaService getTaxaService() {
        return taxaService;
    }

    public void setTaxaService(TaxaService taxaService) {
        this.taxaService = taxaService;
    }

    public double calcularSaldoComTaxa(Empresa empresa, double valorTransacao) {
        double taxa = taxaService.calcularTaxa();
        return empresa.getSaldo() + valorTransacao - taxa;
    }
    
}