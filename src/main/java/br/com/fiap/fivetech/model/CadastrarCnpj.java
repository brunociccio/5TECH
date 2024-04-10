package br.com.fiap.fivetech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class CadastrarCnpj extends Cadastrar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCadastrarCnpj;
    
    @NotBlank(message = "O CNPJ é obrigatório")
    private String cnpj;
    
    @NotBlank(message = "A inscrição estadual é obrigatória")
    private String inscricaoEstadual;
    
    @NotBlank(message = "A razão social é obrigatória")
    private String razaoSocial;
    
    private String porteDaEmpresa;
    
    private Date dataAberturaEmpresa;
    
    private int qtdFuncionarios;
}
