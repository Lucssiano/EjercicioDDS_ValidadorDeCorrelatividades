package universidad;

import personas.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>(); // Inicializo la lista
    }

    public Boolean aprobada(){
        return alumno.aproboCorrelativas(this.materias.toArray(new Materia[0])); // No sé si está bien así
    }

    public String getAlumno() {
        return alumno.getNombre();
    }

    public List<String> getMaterias() {
        return materias.stream()
                .map(Materia::getNombre) // Obtengo el nombre de cada materia
                .collect(Collectors.toList()); // Se recolectan los nombres en una lista
    }

    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materias, materias);
    }
}
