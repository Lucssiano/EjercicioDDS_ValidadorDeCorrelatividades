package universidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>(); // Inicializo la lista
    }
    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void agregarMateriasCorrelativas(Materia ... materias){
        Collections.addAll(this.materiasCorrelativas, materias);
    }
}
