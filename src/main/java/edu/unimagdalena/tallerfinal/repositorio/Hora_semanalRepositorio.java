package edu.unimagdalena.tallerfinal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.tallerfinal.entities.Hora_semanal;
@Repository
public interface Hora_semanalRepositorio extends JpaRepository<Hora_semanal,Long> {

}
