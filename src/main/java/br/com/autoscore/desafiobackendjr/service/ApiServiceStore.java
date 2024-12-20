package br.com.autoscore.desafiobackendjr.service;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import br.com.autoscore.desafiobackendjr.dto.ScoreDto;
import br.com.autoscore.desafiobackendjr.entity.Score;
import br.com.autoscore.desafiobackendjr.repository.ScoreRepository;
@Service
public class ApiServiceStore {
    private  ScoreRepository scoreReppository;
    private  WebClient.Builder webClientBuilder;


    public ApiServiceStore(ScoreRepository scoreReppository, Builder webClientBuilder) {
        this.scoreReppository = scoreReppository;
        this.webClientBuilder = webClientBuilder;
    }

    public Map<String, String>  salvarVeiculo(Score score) {
        // Chama a API externa
        ScoreDto apiDados = consultarApiExterna(score.getPlaca());
    
        // Atualiza o objeto Score com os dados da API
        score.setProprietario(apiDados.getProprietario());
        score.setCpf(apiDados.getCpf());
        score.setPlaca(apiDados.getPlaca());
    
        // Persiste no banco
        scoreReppository.save(score);
    
        // Retorna apenas os campos desejados
        Map<String, String> response = new HashMap<>();
        response.put("proprietario", score.getProprietario());
        response.put("cpf", score.getCpf());
        response.put("placa", score.getPlaca());
    
        return response;
    }
    

    private ScoreDto consultarApiExterna(String placa) {
        String url = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=" + placa;

        // Realiza a consulta na API externa usando WebClient
        return webClientBuilder.baseUrl(url)
            .build()
            .get()
            .retrieve()
            .bodyToMono(ScoreDto.class)
            .block(); // Bloqueia até que a resposta seja recebida
    }

  
}
