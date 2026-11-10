package ar.edu.unju.escmi.tp8.service;

import java.util.List;

import ar.edu.unju.escmi.tp8.model.Empresa;

public interface IEmpresaService {

    void guardarEmpresa(Empresa empresa);
    void eliminarEmpresa(int id);
    void modificarEmpresa(Empresa empresa);
    List<Empresa> obtenerEmpresas();
    Empresa buscarEmpresaId(int id);
    Empresa getEmpresa();
}