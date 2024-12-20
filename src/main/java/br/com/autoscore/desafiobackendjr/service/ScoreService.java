package br.com.autoscore.desafiobackendjr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.autoscore.desafiobackendjr.entity.Score;
import br.com.autoscore.desafiobackendjr.repository.ScoreRepository;


@Service
public class ScoreService {

    private  ScoreRepository scoreRepository;
 public ScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }
// Método para listar todas as pontuações
 public List<Score> getAllScores() {
    return scoreRepository.findAll();
}
public List<Score> updadeScore(Score score){
    scoreRepository.save(score);
    return getAllScores();
}


public List<Score> deleteScore(Long id) {
    scoreRepository.deleteById(id);
    return getAllScores();
}
}
