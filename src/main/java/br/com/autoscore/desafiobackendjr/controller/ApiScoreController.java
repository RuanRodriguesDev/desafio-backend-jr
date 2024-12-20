package br.com.autoscore.desafiobackendjr.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.autoscore.desafiobackendjr.entity.Score;
import br.com.autoscore.desafiobackendjr.service.ApiServiceStore;
import br.com.autoscore.desafiobackendjr.service.ScoreService;

@RestController
@RequestMapping("/veiculos")
public class ApiScoreController {

    private ApiServiceStore apiServiceStore;
    private ScoreService scoreService;

    public ApiScoreController(ApiServiceStore apiServiceStore, ScoreService scoreService) {
        this.apiServiceStore = apiServiceStore;
        this.scoreService = scoreService;
    }

    @PostMapping
    public ResponseEntity<Score> salvarVeiculo(@RequestBody Score score){
        Score salvarScore = apiServiceStore.salvarVeiculo(score);
        return ResponseEntity.ok(salvarScore);
    }

    @GetMapping
     List<Score> listaVeiculo(){
        List<Score> listaveiculo =  scoreService.getAllScores();
        return (listaveiculo);
    }
    @PutMapping("/{id}")
    List<Score> updateVeiculo(@RequestBody Score score,@PathVariable("id")Long id){
         return  scoreService.updadeScore(score);
     }
  

    @DeleteMapping("/{id}")
    List<Score> deleteVeiculo(@PathVariable("id")Long id){
        return  scoreService.deleteScore(id);
    }
    
}
