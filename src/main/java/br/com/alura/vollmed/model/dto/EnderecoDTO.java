package br.com.alura.vollmed.model.dto;

public record EnderecoDTO(
        String logradouro,
        String bairro,
        String cep,
        String cidade,
        String uf,
        String complemento,
        String numero
) {
}
