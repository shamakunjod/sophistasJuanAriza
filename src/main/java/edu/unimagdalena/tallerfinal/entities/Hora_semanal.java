package edu.unimagdalena.tallerfinal.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "hora_semanal")
public class Hora_semanal implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	@Column(name = "dia")
	private String dia;
	@Column(name = "hora")
	private String hora;
	@Column(name = "dia_indice")
	private String dia_indice;
	@Column(name = "hora_indice")
	private String hora_indice;
	@ManyToMany(mappedBy = "horasemanal")
	private Set<Clase> id_clase;
	public Hora_semanal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDia_indice() {
		return dia_indice;
	}
	public void setDia_indice(String dia_indice) {
		this.dia_indice = dia_indice;
	}
	public String getHora_indice() {
		return hora_indice;
	}
	public void setHora_indice(String hora_indice) {
		this.hora_indice = hora_indice;
	}
	public Set<Clase> getId_clase() {
		return id_clase;
	}
	public void setId_clase(Set<Clase> id_clase) {
		this.id_clase = id_clase;
	}
	
	
}
