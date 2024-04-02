package domain;

import org.junit.Assert;
import org.junit.Test;
import personas.Alumno;
import universidad.Inscripcion;
import universidad.Materia;

public class InscripcionTest {
    @Test
    public void inscripcionVariasMateriasAprobada(){
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

        Assert.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void inscripcionVariasMateriasDesaprobada(){
        Alumno unAlumno = new Alumno("Luciano", "Riente", 2084806);

        Materia sistemasOperativos = new Materia("Sistemas Operativos");
        Materia analisisMatematico2 = new Materia("Analisis Matematico 2");

        Materia analisisMatematico1 = new Materia("Analisis Matematico 1");
        Materia algebra = new Materia("Algebra y Geometria Analitica");
        Materia arquitecturaDeComputadoras = new Materia("Arquitectura de Computadoras");

        unAlumno.agregarMateriasAprobadas(analisisMatematico1,arquitecturaDeComputadoras);

        sistemasOperativos.agregarMateriasCorrelativas(arquitecturaDeComputadoras);
        analisisMatematico2.agregarMateriasCorrelativas(analisisMatematico1,algebra);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMaterias(sistemasOperativos, analisisMatematico2);

        Assert.assertFalse(unaInscripcion.aprobada());
    }
}
