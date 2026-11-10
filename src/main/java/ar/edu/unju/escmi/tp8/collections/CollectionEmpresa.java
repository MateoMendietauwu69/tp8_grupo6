package ar.edu.unju.escmi.tp8.collections;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import ar.edu.unju.escmi.tp8.model.Empresa;

@Component
public class CollectionEmpresa {
    public static List<Empresa> empresas = new ArrayList<>();

    public static void precargaEmpresas(){
        if(empresas.isEmpty()){
            empresas.add(new Empresa(1, "Tech Solutions", 45, "3884123456", "Av. Belgrano 450, San Salvador de Jujuy"));
            empresas.add(new Empresa(2, "Comercial Norte", 120, "3884234567", "Calle Alvear 320, San Salvador de Jujuy"));
            empresas.add(new Empresa(3, "Distribuidora Andina", 28, "3884345678", "Av. El Éxodo 780, San Salvador de Jujuy"));
        }
    }
}