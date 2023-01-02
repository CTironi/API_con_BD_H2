package com.sofka.ejercicio1.repositorio;

import com.sofka.ejercicio1.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
