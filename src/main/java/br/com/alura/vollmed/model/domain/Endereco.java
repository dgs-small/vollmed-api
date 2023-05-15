package br.com.alura.vollmed.model.domain;

import br.com.alura.vollmed.model.dto.EnderecoDTO;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    public Endereco(EnderecoDTO enderecoDTO) {
        this.logradouro = enderecoDTO.logradouro();
        this.bairro = enderecoDTO.bairro();
        this.cep = enderecoDTO.cep();
        this.uf = enderecoDTO.uf();
        this.cidade = enderecoDTO.cidade();
        this.numero = enderecoDTO.numero();
        this.complemento = enderecoDTO.complemento();
    }
}
