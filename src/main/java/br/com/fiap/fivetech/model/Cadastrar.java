package br.com.fiap.fivetech.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Cadastrar {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idCadastrar;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "A data de nascimento é obrigatória")
    private Date dataNascimento;

    // Sexo é opcional e pode ser 'M' (masculino), 'F' (feminino), ou 'não informado'
    @Size(min = 1, max = 1)
    private String sexo;

    @NotBlank(message = "A escolaridade é obrigatória")
    private String escolaridade;

    @NotBlank(message = "A profissão é obrigatória")
    private String profissao;

    @NotNull(message = "A renda é obrigatória")
    @Positive(message = "A renda deve ser um número positivo")
    private Double renda;

    @NotNull(message = "Os documentos são obrigatórios")
    private Documentos documentos;

    @NotNull(message = "O endereço é obrigatório")
    private Endereco endereco;

    @NotNull(message = "O contato é obrigatório")
    private Contato contato;

    // Se selecionar "Sim", os detalhes do cadastro de pessoa jurídica serão obrigatórios
    // Se selecionar "Não", o campo será opcional e pode ser preenchido com "Não"
    private CadastrarCnpj cadastrarCnpj;
}

