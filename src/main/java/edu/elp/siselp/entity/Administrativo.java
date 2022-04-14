package edu.elp.siselp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")

public class Administrativo {

    @Column(name = "cod_administrativo")
    private String codAdmin;

    public Administrativo() {
    }

    public String getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(String codAdmin) {
        this.codAdmin = codAdmin;
    }
}
