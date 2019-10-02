package edu.unimagdalena.tallerfinal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "asignaturas")
public class Asignatura implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	@Column(name = "nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "id_curso")
	private Curso cursos;
	
	@OneToMany(mappedBy = "asignaturas")
	private Set<Clase> clases;

	public Asignatura() {
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

	public Curso getId_curso() {
		return cursos;
	}

	public void setId_curso(Curso id_curso) {
		this.cursos = id_curso;
	}

	public Set<Clase> getClase_id() {
		return clases;
	}

	public void setClase_id(Set<Clase> clase_id) {
		this.clases = clase_id;
	}


	
}
