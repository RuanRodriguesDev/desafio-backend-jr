package br.com.autoscore.desafiobackendjr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double cpf;
    private String proprietario;
    private String placa;
    private String marca;
    private String modelo;
    private String chassi;
    private boolean licanciamento;

    public Score(){}

    
    public Score(Long id, Double cpf, String proprietario, String placa, String marca, String modelo, String chassi,
            boolean licanciamento) {
        this.id = id;
        this.cpf = cpf;
        this.proprietario = proprietario;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.licanciamento = licanciamento;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getCpf() {
        return cpf;
    }
    public void setCpf(Double cpf) {
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
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public boolean isLicanciamento() {
        return licanciamento;
    }
    public void setLicanciamento(boolean licanciamento) {
        this.licanciamento = licanciamento;
    }   
}
