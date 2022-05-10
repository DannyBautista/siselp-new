package edu.elp.siselp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "escuela")

public class Escuela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idescuela;

    private String codigo;

    private String denominacion;


    @OneToMany(mappedBy = "escuela")
    private List<Estudiante> estudianteList;

    public List<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(List<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }

    public Escuela() {
    }

    public Long getIdescuela() {
        return idescuela;
    }

    public Escuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public Escuela(String codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public void setIdescuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
