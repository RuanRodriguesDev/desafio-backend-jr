package br.com.autoscore.desafiobackendjr.dto;

import br.com.autoscore.desafiobackendjr.entity.Score;

public class ScoreDto {
    private Long id;
    private Double cpf;
    private String proprietario;
    private String placa;

    public ScoreDto(){}

    public ScoreDto(Score entity){
        id = entity.getId();
        cpf = entity.getCpf();
        proprietario = entity.getProprietario();
        placa = entity.getPlaca();
    }

    public Long getId() {
        return id;
    }

    public Double getCpf() {
        return cpf;
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }
    
    
}
