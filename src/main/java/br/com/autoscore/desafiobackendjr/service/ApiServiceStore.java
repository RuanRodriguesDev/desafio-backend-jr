package br.com.autoscore.desafiobackendjr.service;


import org.springframework.web.reactive.function.client.WebClient;


import br.com.autoscore.desafiobackendjr.dto.ScoreDto;
import br.com.autoscore.desafiobackendjr.entity.Score;
import br.com.autoscore.desafiobackendjr.repository.ScoreReppository;

public class ApiServiceStore {
    private  ScoreReppository scoreReppository;
    private  WebClient.Builder webClientBuilder;


    public Score salvarVeiculo(Score score) {
        // Chama a API externa
        ScoreDto apiDados = consultarApiExterna(score.getPlaca());

        // Atualiza o objeto Veiculo com os dados da API
        score.setProprietario(apiDados.getProprietario());
        score.setCpf(apiDados.getCpf());
        score.setPlaca(apiDados.getPlaca());

        // Persiste no banco
        return scoreReppository.save(score);
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
