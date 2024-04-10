package br.com.fiap.fivetech.controller;

import br.com.fiap.fivetech.model.Endereco;
import br.com.fiap.fivetech.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("/buscar/{cep}")
    public ResponseEntity<Endereco> buscarEnderecoPorCep(@PathVariable String cep) {
        Endereco endereco = enderecoRepository.findByCep(cep);

        if (endereco != null) {
            return ResponseEntity.ok(endereco);
        } else {
            // Se o endereço não for encontrado no banco de dados, fazer a consulta na API do Postmon
            String url = "https://api.postmon.com.br/v1/cep/" + cep;
            try {
                endereco = restTemplate.getForObject(url, Endereco.class);
                if (endereco != null) {
                    // Salvar o endereço no banco de dados antes de retorná-lo
                    enderecoRepository.save(endereco);
                    return ResponseEntity.ok(endereco);
                } else {
                    return ResponseEntity.notFound().build();
                }
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }
    }
}

