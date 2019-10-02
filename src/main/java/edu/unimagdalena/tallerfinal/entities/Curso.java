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
@Table(name = "cursos")
public class Curso implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	@Column(name = "nivel")
	private Long nivel;
	@Column(name = "etapa")
	private String etapa;
	@OneToMany(mappedBy = "cursos")
	private Set<Alumno> alumnos;
	@OneToMany(mappedBy = "cursos")
	private Set<Asignatura> asignatura;
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNivel() {
		return nivel;
	}
	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public Set<Asignatura> getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Set<Asignatura> asignatura) {
		this.asignatura = asignatura;
	}
	
	
}
