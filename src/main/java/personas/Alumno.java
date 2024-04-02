package personas;

import universidad.Materia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public Boolean aproboCorrelativas(Materia materia){
        List <Materia> materiasCorrelativas = materia.getMateriasCorrelativas();
        return materiasAprobadas.containsAll(materiasCorrelativas);
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
