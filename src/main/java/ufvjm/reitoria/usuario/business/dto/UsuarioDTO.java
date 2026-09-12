package ufvjm.reitoria.usuario.business.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    private String nome;
    private String email;
    private String senha;
    List<EnderecoDTO> enderecos;
    List<TelefoneDTO> telefones;

}
