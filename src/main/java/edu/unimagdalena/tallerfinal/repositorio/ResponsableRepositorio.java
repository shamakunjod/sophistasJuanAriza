package edu.unimagdalena.tallerfinal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.tallerfinal.entities.Responsable;
@Repository
public interface ResponsableRepositorio extends JpaRepository<Responsable,Long> {

}
