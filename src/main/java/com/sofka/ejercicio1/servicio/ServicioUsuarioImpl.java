package com.sofka.ejercicio1.servicio;

import com.sofka.ejercicio1.modelo.Usuario;
import com.sofka.ejercicio1.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServicioUsuarioImpl implements ServicioUsuario{


    private final RepositorioUsuario repositorioUsuario;
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @Override
    public Usuario obtenerUsuario(Long idUsuario) {
        return repositorioUsuario.findById(idUsuario).orElseThrow(() -> {throw  new RuntimeException();});
    }

    @Override
    public Usuario usuarioAModificar(Long id, Usuario usuarioModificar) {

        Usuario usuarioBuscado = repositorioUsuario.findById(id).get();
        usuarioBuscado.setNombre(usuarioModificar.getNombre());
        usuarioBuscado.setApellido(usuarioModificar.getApellido());
        usuarioBuscado.setTelefono(usuarioModificar.getTelefono());
        usuarioBuscado.setDireccion(usuarioModificar.getDireccion());
        return repositorioUsuario.save(usuarioBuscado);
    }

    @Override
    public boolean eliminarUsuario(Long id) {

        try {
            repositorioUsuario.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
