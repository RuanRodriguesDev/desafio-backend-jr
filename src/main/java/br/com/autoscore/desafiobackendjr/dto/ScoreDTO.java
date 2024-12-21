package br.com.autoscore.desafiobackendjr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;


public class ScoreDto {
    private Long id;
    @NotBlank(message = "Cpf é obrigatório.")
    @JsonProperty("cpf")
    private String cpf;
    @NotBlank(message = "Proprietário é obrigatório.")
    @JsonProperty("proprietario")
    private String proprietario;
    @NotBlank(message = "Placa é obrigatório.")
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


    public void setId(Long id) {
        this.id = id;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getProprietario() {
        return proprietario;
    }


    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }   
    
}
