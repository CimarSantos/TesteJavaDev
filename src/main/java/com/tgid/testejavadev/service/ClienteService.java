package com.tgid.testejavadev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgid.testejavadev.model.Empresa;

@Service
public class ClienteService {

    @Autowired
    private EmpresaService empresaService;

    public boolean realizarDeposito(Empresa empresa, double valorDeposito) {
       
        double saldoAtualizado = empresaService.calcularSaldoComTaxa(empresa, valorDeposito);
        if (saldoAtualizado >= 0) {
            empresa.setSaldo(saldoAtualizado);
            return true;
        } else {
            return false;
        }
    }

    public EmpresaService getEmpresaService() {
        return empresaService;
    }

    public void setEmpresaService(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }
}