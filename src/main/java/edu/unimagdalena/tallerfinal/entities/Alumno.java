package edu.unimagdalena.tallerfinal.entities;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import org.hibernate.annotations.ManyToAny;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "alumnos")

public class Alumno implements Serializable {
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
	
	@Column(name = "responsable")
	private Long id_responsable;

	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso cursos;
	
	@ManyToMany(mappedBy = "alumnos")
	private Set<Clase> id_clase ;
	
	@Column(name = "repetidor")
	private Boolean repetidor;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_alta;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_baja;
	@Column
	private String observaciones;
	public Alumno() {
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
	public Long getId_responsable() {
		return id_responsable;
	}
	public void setId_responsable(Long id_responsable) {
		this.id_responsable = id_responsable;
	}
	public Curso getId_curso() {
		return cursos;
	}
	public void setId_curso(Curso id_curso) {
		this.cursos = id_curso;
	}
	public Set<Clase> getId_clase() {
		return id_clase;
	}
	public void setId_clase(Set<Clase> id_clase) {
		this.id_clase = id_clase;
	}
	public Boolean getRepetidor() {
		return repetidor;
	}
	public void setRepetidor(Boolean repetidor) {
		this.repetidor = repetidor;
	}
	public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public Date getFecha_baja() {
		return fecha_baja;
	}
	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	

}
