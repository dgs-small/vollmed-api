package br.com.alura.vollmed.controller;

import br.com.alura.vollmed.model.domain.Medico;
import br.com.alura.vollmed.model.dto.CadastroMedicoDTO;
import br.com.alura.vollmed.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void create(@RequestBody CadastroMedicoDTO cadastroMedicoDTO) {
        repository.save(new Medico(cadastroMedicoDTO));
    }
}
