package edu.elp.siselp.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idusuario;

    private String username;
    private String contraseña;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "idpersona")
    private Persona persona;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "iduser"),
            inverseJoinColumns = @JoinColumn(name = "idrole"))
    private Set<Rol> roles = new HashSet<>();


    public Usuario() {
    }

    public Usuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(long idusuario, String username, String contraseña, Persona persona) {
        this.idusuario = idusuario;
        this.username = username;
        this.contraseña = contraseña;
        this.persona = persona;
    }

    public Usuario(long idusuario, String username, String contraseña, Persona persona, Set<Rol> roles) {
        this.idusuario = idusuario;
        this.username = username;
        this.contraseña = contraseña;
        this.persona = persona;
        this.roles = roles;
    }

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
}
