package br.com.fiap.fivetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.fivetech.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    Endereco findByCep(String cep);
}
