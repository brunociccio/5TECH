package br.com.fiap.fivetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.fivetech.model.Documentos;

@Repository
public interface DocumentosRepository extends JpaRepository<Documentos, Long> {

}
