package edu.unimagdalena.tallerfinal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.tallerfinal.entities.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

}
