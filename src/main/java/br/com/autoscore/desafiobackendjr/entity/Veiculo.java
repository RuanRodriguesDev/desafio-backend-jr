package br.com.autoscore.desafiobackendjr.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_veiculos")
public class Veiculo  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cpf;
    private String proprietario;
    private String placa;
    private String marca;
    private String modelo;
    private String chassi;
    private boolean licenciamento;

    public Veiculo(){}


    public Veiculo(long id, String cpf, String proprietario, String placa, String marca, String modelo, String chassi,
            boolean licenciamento) {
        this.id = id;
        this.cpf = cpf;
        this.proprietario = proprietario;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.licenciamento = licenciamento;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public boolean isLicenciamento() {
        return licenciamento;
    }

    public void setLicenciamento(boolean licenciamento) {
        this.licenciamento = licenciamento;
    }

    


}
