package br.com.autoscore.desafiobackendjr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.autoscore.desafiobackendjr.entity.Score;


public interface ScoreReppository extends JpaRepository<Score,Long> {
    
}
