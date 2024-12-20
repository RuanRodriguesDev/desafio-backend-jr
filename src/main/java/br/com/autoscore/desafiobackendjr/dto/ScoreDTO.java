package br.com.autoscore.desafiobackendjr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ScoreDto {
    private Long id;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("proprietario")
    private String proprietario;
    @JsonProperty("placa")
    private String placa;

    public ScoreDto(){}


    public ScoreDto(Long id, String cpf, String proprietario, String placa) {
        this.id = id;
        this.cpf = cpf;
        this.proprietario = proprietario;
        this.placa = placa;
    }


    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }
    
    
}
