package edu.unimagdalena.tallerfinal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clases")
public class Clase implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@ManyToOne
	@JoinColumn(name="id_profesor")
	private Profesor profesores;
	
	@ManyToMany
	@JoinTable(name="clase_alumno",
	joinColumns= @JoinColumn( name="id_clase", referencedColumnName="id"), 
	inverseJoinColumns=@JoinColumn( name="id_alumno", referencedColumnName="id"))
	private Set<Alumno> alumnos;
	
	@ManyToOne
	@JoinColumn(name = "id_asignatura")
	private Asignatura asignaturas;
	
	@ManyToMany
	@JoinTable(name="clase_horasemanal",
	joinColumns= @JoinColumn( name="id_clase", referencedColumnName="id"), 
	inverseJoinColumns=@JoinColumn( name="id_horasemanal", referencedColumnName="id"))
	private Set<Hora_semanal> horasemanal;
	public Clase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Profesor getId_profesor() {
		return profesores;
	}
	public void setId_profesor(Profesor id_profesor) {
		this.profesores = id_profesor;
	}
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public Asignatura getId_asignatura() {
		return asignaturas;
	}
	public void setId_asignatura(Asignatura id_asignatura) {
		this.asignaturas = id_asignatura;
	}
	public Set<Hora_semanal> getHorasemanal() {
		return horasemanal;
	}
	public void setHorasemanal(Set<Hora_semanal> horasemanal) {
		this.horasemanal = horasemanal;
	}
	
	
}
