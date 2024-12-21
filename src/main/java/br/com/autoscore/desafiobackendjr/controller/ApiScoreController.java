package br.com.autoscore.desafiobackendjr.controller;


import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.autoscore.desafiobackendjr.dto.ScoreDto;
import br.com.autoscore.desafiobackendjr.entity.Score;
import br.com.autoscore.desafiobackendjr.service.ApiServiceStore;
import br.com.autoscore.desafiobackendjr.service.ScoreService;
import jakarta.validation.Valid;

@Valid
@RestController
@RequestMapping("/veiculos")
public class ApiScoreController {
   

    private ApiServiceStore apiServiceStore;
    private ScoreService scoreService;

    public ApiScoreController(ApiServiceStore apiServiceStore, ScoreService scoreService) {
        this.apiServiceStore = apiServiceStore;
        this.scoreService = scoreService;
    }

    @GetMapping("/error")
    public String triggerError() {
        throw new RuntimeException("Erro de teste");
    }

    @PostMapping
    public ResponseEntity<List<ScoreDto>> criarVeiculo(@RequestBody Score score) {
        return scoreService.salvarVeiculo(score);
    }

    // @PostMapping
    // public ResponseEntity<Score> salvarVeiculo(@RequestBody Score score){
    //     Score salvarScore = (Score) apiServiceStore.salvarVeiculo(score);
    //     return ResponseEntity.ok(salvarScore);
    // }

    @GetMapping
     List<ScoreDto> listaVeiculo(){
        List<ScoreDto> listaveiculo =  scoreService.getAllScores();
        return (listaveiculo);
    }
    @PutMapping("/{id}")
    List<ScoreDto> updateVeiculo(@RequestBody Score score,@PathVariable("id")Long id){
         return  scoreService.updadeScore(score);
     }
  

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarVeiculosPorIds(@PathVariable("id")Long id) {
        scoreService.deletarVeiculosPorIds(id);
        return ResponseEntity.noContent().build();
    }
    
}
