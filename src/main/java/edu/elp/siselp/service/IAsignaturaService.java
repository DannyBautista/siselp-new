package edu.elp.siselp.service;



import edu.elp.siselp.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    List<Asignatura> listaAsignaturas();

    Asignatura obtenerPorDenominacionOrSigla(String denoSig);

    Asignatura guardarAsignatura(Asignatura asignatura);
}
