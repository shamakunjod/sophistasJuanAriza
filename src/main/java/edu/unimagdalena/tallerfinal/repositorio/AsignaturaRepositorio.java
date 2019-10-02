package edu.unimagdalena.tallerfinal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.tallerfinal.entities.Asignatura;
@Repository
public interface AsignaturaRepositorio extends JpaRepository<Asignatura, Long> {

}
