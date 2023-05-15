package br.com.alura.vollmed.repository;

import br.com.alura.vollmed.model.domain.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> { }
