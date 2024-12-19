package br.com.autoscore.desafiobackendjr.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.autoscore.desafiobackendjr.entity.Score;
import br.com.autoscore.desafiobackendjr.service.ApiServiceStore;

@RestController
@RequestMapping("/veiculos")
public class ApiScoreController {

    private ApiServiceStore apiServiceStore;

    public ApiScoreController(ApiServiceStore apiServiceStore) {
        this.apiServiceStore = apiServiceStore;
    }

    @PostMapping
    public ResponseEntity<Score> salvarVeiculo(@RequestBody Score score){
        Score salvarScore = apiServiceStore.salvarVeiculo(score);
        return ResponseEntity.ok(salvarScore);
    }
    
}
