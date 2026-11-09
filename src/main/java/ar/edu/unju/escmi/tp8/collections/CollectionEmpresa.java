package ar.edu.unju.escmi.tp8.collections;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import ar.edu.unju.escmi.tp8.model.Empresa;

@Component
public class CollectionEmpresa {
    public static List<Empresa> empresas = new ArrayList<>();
}