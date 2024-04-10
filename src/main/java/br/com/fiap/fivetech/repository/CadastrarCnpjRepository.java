package br.com.fiap.fivetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.fivetech.model.CadastrarCnpj;

public interface CadastrarCnpjRepository extends JpaRepository<CadastrarCnpj, Integer> {
    CadastrarCnpj findById(int id);
}

