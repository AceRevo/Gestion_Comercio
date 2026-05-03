package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorComercio {
    private final List<Comercio>comercios;

    public GestorComercio() {
        this.comercios = new ArrayList<>();
    }

    public Comercio buscarPorId(String id){
        Comercio resultado = null;
        Comercio temporal = null;
        int posicion = 0;
        int cantidadComercio = comercios.size();
        while (cantidadComercio > 0 && resultado== null && posicion < cantidadComercio){
            temporal = comercios.get(posicion);
            if (temporal.getID().equalsIgnoreCase(id)){
                resultado = temporal;
            }
            posicion ++;
        }
        return resultado;
    }

    public  Comercio buscarPorNombre(String nombre){
        Comercio resultado = null;
        Comercio temporal = null;
        int posicion = 0;
        int cantidadComercio = comercios.size();
        while (cantidadComercio > 0 && resultado== null && posicion < cantidadComercio){
            temporal =comercios.get(posicion);

            if (temporal.getNombre().equalsIgnoreCase(nombre)) {
                resultado = temporal;
            }
            posicion ++;
        }
        return resultado;
    }

    public boolean addComercio (Comercio c){
        boolean resultado = false;
        if (buscarPorId(c.getID())== null){
            comercios.add(c);
            resultado = true;
        }
        return  resultado;
    }

    public Comercio eliminarPorID(String id){
        Comercio resultado = null;
        comercios.remove(resultado);
        return  resultado;
    }

    public Comercio modificarCiudad(String id, String nuevaCiudad){
        Comercio resultado = null;
        resultado = buscarPorId(id);

        if (resultado != null){
            resultado.setCiudad(nuevaCiudad);
        }
        return resultado;
    }

    public String imprimirTodos(){
        StringBuilder sb = new StringBuilder();

        for (Comercio comercio : comercios){
            sb.append(comercio.toString());
        }
        return  sb.toString();
    }

    public String imprimirPorTipoDeComercio(TipoComercio tipo){
        StringBuilder sb = new StringBuilder(String.format("Comercios del tipo = %s", tipo));
        for (Comercio comercio : comercios){
            sb.append(comercio.toString());
        }
        return  sb.toString();
    }
}
