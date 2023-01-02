package com.sofka.ejercicio1.servicio;

import com.sofka.ejercicio1.modelo.Usuario;

public interface ServicioUsuario {

    Usuario guardarUsuario(Usuario usuario);

    Usuario obtenerUsuario(Long idUsuario);

    Usuario usuarioAModificar(Long id, Usuario usuarioModificar);

    boolean eliminarUsuario(Long id);
}
