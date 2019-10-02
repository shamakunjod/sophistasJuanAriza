package edu.unimagdalena.tallerfinal.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "responsables")
public class Responsable implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	@Column(name="nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "apellido2")
	private String apellido2;
	@Column(name = "nif")
	private String nif;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "correo")
	private String correo;
	@OneToMany(mappedBy = "id_responsable")
	private Set<Alumno> alumno;
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Set<Alumno> getAlumno() {
		return alumno;
	}
	public void setAlumno(Set<Alumno> alumno) {
		this.alumno = alumno;
	} 
	
	
}
