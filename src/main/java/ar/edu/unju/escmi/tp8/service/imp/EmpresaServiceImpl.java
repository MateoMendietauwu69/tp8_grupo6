package ar.edu.unju.escmi.tp8.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.escmi.tp8.collections.CollectionEmpresa;
import ar.edu.unju.escmi.tp8.model.Empresa;
import ar.edu.unju.escmi.tp8.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Override
    public void guardarEmpresa(Empresa empresa) {
        CollectionEmpresa.empresas.add(empresa);
    }

    @Override
    public List<Empresa> obtenerEmpresas() {
        return CollectionEmpresa.empresas;
    }

    @Override
    public void modificarEmpresa(Empresa empresaModificada) {
        for (int i = 0; i < CollectionEmpresa.empresas.size(); i++) {
            Empresa e = CollectionEmpresa.empresas.get(i);
            if (e.getId() == empresaModificada.getId()) {
                CollectionEmpresa.empresas.set(i, empresaModificada);
                break;
            }
        }
    }

    @Override
    public void eliminarEmpresa(int id) {
        CollectionEmpresa.empresas.removeIf(e -> e.getId() == id);
    }

    @Override
    public Empresa buscarEmpresaId(int id) {
        return CollectionEmpresa.empresas.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Empresa getEmpresa() {
        return new Empresa();
    }
}
