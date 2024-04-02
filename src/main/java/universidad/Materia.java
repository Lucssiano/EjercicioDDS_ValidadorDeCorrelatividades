package universidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>(); // Inicializo la lista
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getMateriasCorrelativas() {
        return materiasCorrelativas.stream()
                .map(Materia::getNombre) // Obtengo el nombre de cada materia
                .collect(Collectors.toList()); // Se recolectan los nombres en una lista
    }

    public void agregarMateriasCorrelativas(Materia ... materias){
        Collections.addAll(this.materiasCorrelativas, materias);
    }
}
