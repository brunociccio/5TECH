package br.com.fiap.fivetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.fivetech.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
    Contato findByEmail(String email);
    Contato findByTelefoneCelular(String celular);
}

