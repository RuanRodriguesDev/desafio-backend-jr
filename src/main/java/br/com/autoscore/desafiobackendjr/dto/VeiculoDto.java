package br.com.autoscore.desafiobackendjr.dto;

import br.com.autoscore.desafiobackendjr.entity.Veiculo;

public class VeiculoDto {
     private long id;
     private String cpf;
     private String proprietario;
     private String placa;
     private String marca;
     private String modelo;
     private String chassi;
     private boolean licenciamento;

  
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
