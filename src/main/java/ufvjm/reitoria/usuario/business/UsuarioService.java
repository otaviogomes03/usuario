package ufvjm.reitoria.usuario.business;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ufvjm.reitoria.usuario.business.dto.UsuarioDTO;
import ufvjm.reitoria.usuario.converter.UsuarioConverter;
import ufvjm.reitoria.usuario.infrastructure.entity.Usuario;
import ufvjm.reitoria.usuario.infrastructure.repository.UsuarioRepository;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }

}
