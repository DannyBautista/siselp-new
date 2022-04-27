package edu.elp.siselp.dao;

import edu.elp.siselp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaDao extends JpaRepository<Persona,Long> {

    @Query("SELECT p FROM persona p WHERE p.dni =?1")
    Persona buscarPersona(String dni);
    Persona findByDni(String dni);
    @Query("SELECT p FROM persona p WHERE p.nombre =?1 AND p.apellido = ?2")
    Persona findByNombreAndApellido(String nombre, String apellido);

}