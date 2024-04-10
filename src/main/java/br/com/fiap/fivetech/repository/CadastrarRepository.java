package br.com.fiap.fivetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.fivetech.model.Cadastrar;

@Repository
public interface CadastrarRepository extends JpaRepository<Cadastrar, Long> {

}
