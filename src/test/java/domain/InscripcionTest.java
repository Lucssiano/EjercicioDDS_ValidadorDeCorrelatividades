package domain;

import org.junit.Assert;
import org.junit.Test;
import personas.Alumno;
import universidad.Inscripcion;
import universidad.Materia;

public class InscripcionTest {
    @Test
    public void laInscripcionFueAprobada(){
        Alumno unAlumno = new Alumno("Luciano", "Riente", 2084806);

        Materia sistemasOperativos = new Materia("Sistemas Operativos");
        Materia analisisMatematico2 = new Materia("Analisis Matematico 2");

        Materia analisisMatematico1 = new Materia("Analisis Matematico 1");
        Materia algebra = new Materia("Algebra y Geometria Analitica");
        Materia arquitecturaDeComputadoras = new Materia("Arquitectura de Computadoras");

        unAlumno.agregarMateriasAprobadas(algebra,analisisMatematico1,arquitecturaDeComputadoras);

        sistemasOperativos.agregarMateriasCorrelativas(arquitecturaDeComputadoras);
        analisisMatematico2.agregarMateriasCorrelativas(analisisMatematico1,algebra);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMaterias(sistemasOperativos, analisisMatematico2);

        System.out.println("Materias aprobadas de un alumno: " + unAlumno.getMateriasAprobadas());
        System.out.println("Materias correlativas de SO: " + sistemasOperativos.getMateriasCorrelativas());
        System.out.println("Materias correlativas de AM2: " + analisisMatematico2.getMateriasCorrelativas());
        System.out.println("Materias a las que el alumno " + unaInscripcion.getAlumno() + " se quiere anotar: " + unaInscripcion.getMaterias());

        Assert.assertTrue(unaInscripcion.aprobada());
    }
}
