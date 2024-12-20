package br.com.autoscore.desafiobackendjr.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.autoscore.desafiobackendjr.dto.ScoreDto;
import br.com.autoscore.desafiobackendjr.entity.Score;
import br.com.autoscore.desafiobackendjr.repository.ScoreRepository;


@Service
public class ScoreService {

    private  ScoreRepository scoreRepository;
 public ScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }
// Método para listar todas as pontuações
 public List<ScoreDto> getAllScores() {
    return scoreRepository.findAll().stream()
    .map(score -> new ScoreDto(
        null, score.getCpf(),
        score.getProprietario(),
        score.getPlaca())).collect(Collectors.toList());
     
}
public List<ScoreDto> updadeScore(Score score){
    scoreRepository.save(score);
    return getAllScores();
}


public List<ScoreDto> deleteScore(Long id) {
    scoreRepository.deleteById(id);
    return getAllScores();
}
}
