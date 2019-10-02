package edu.unimagdalena.tallerfinal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.tallerfinal.entities.Profesor;
@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor,Long> {

}
