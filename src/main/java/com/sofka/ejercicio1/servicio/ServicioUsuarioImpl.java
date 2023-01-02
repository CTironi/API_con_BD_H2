package com.sofka.ejercicio1.servicio;

import com.sofka.ejercicio1.modelo.Usuario;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario{


    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Optional<Usuario> obtenerUsuario(Long idUsuario) {
        return Optional.empty();
    }

    @Override
    public Usuario usuarioAModificar(Long id, Usuario usuarioModificar) {
        return null;
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        return false;
    }
}
