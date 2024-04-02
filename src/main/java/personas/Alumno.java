package personas;

import universidad.Materia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>(); // Inicializo la lista
    }

    public List<String> getMateriasAprobadas() {
        return materiasAprobadas.stream()
                .map(Materia::getNombre) // Obtengo el nombre de cada materia
                .collect(Collectors.toList()); // Se recolectan los nombres en una lista
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean aproboCorrelativas(Materia ... materias){
        return Arrays.stream(materias).allMatch(materiasAprobadas::contains);
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
