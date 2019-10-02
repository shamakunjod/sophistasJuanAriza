package edu.unimagdalena.tallerfinal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.tallerfinal.entities.Alumno;
@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {

}
