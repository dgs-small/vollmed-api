package br.com.alura.vollmed.model.dto;

import br.com.alura.vollmed.model.enums.Especialidade;

public record CadastroMedicoDTO(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        EnderecoDTO enderecoDTO
) {
}
