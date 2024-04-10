package br.com.fiap.fivetech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class Contato extends Cadastrar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContato;
    
    @Email(message = "O email deve ser válido")
    private String email;
    
    private String telefoneFixo;
    
    private String telefoneCelular;

}
