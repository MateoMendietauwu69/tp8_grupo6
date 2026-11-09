package ar.edu.unju.escmi.tp8.service;

import java.util.List;

import ar.edu.unju.escmi.tp8.model.Empresa;

public interface IEmpresaService {

    void guardarEmpresa(Empresa empresa);
    void eliminarEmpresa(Long id);
    void modificarEmpresa(Empresa empresa);
    List<Empresa> obtenerEmpresas();
    Empresa buscarEmpresaId(Long id);
    Empresa getEmpresa();
}