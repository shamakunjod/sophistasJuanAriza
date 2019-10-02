package edu.unimagdalena.tallerfinal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.tallerfinal.entities.Curso;
@Repository
public interface CursoRepositorio extends JpaRepository<Curso,Long> {

}
