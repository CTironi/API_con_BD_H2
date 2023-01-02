package com.sofka.ejercicio1.servicio;

import com.sofka.ejercicio1.modelo.Usuario;

import java.util.Optional;

public interface ServicioUsuario {

    Usuario guardarUsuario(Usuario usuario);

    Optional<Usuario> obtenerUsuario(Long idUsuario);

    Usuario usuarioAModificar(Long id, Usuario usuarioModificar);

    boolean eliminarUsuario(Long id);
}
