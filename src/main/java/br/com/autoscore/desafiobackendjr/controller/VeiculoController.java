package br.com.autoscore.desafiobackendjr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.autoscore.desafiobackendjr.dto.VeiculoDto;
import br.com.autoscore.desafiobackendjr.entity.Veiculo;
import br.com.autoscore.desafiobackendjr.service.ApiVeiculos;
import br.com.autoscore.desafiobackendjr.service.VeiculoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping(value = "api/endereco")
public class VeiculoController {

    private ApiVeiculos apiVeiculos;
  
    private VeiculoService veiculoService;

    public VeiculoController(ApiVeiculos apiVeiculos, VeiculoService veiculoService) {
        this.apiVeiculos = apiVeiculos;
        this.veiculoService = veiculoService;
    }
    
    @GetMapping("veiculo/{placa}")
     public ResponseEntity<VeiculoDto> buscaPlaca(@PathVariable("placa") String placa, String apiKey) {
      
        try {
            VeiculoDto veiculoDto = apiVeiculos.veiculoDto(placa, apiKey);
            return ResponseEntity.ok(veiculoDto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("veiculo/{placa}")
     public ResponseEntity<Veiculo> saveVeiculo(@PathVariable("placa") String placa) {
         
        try {
            Veiculo veiculos = veiculoService.saveVeiculo(placa); 
            return ResponseEntity.ok(veiculos);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("veiculo")
    public List<Veiculo> listaVeiculo(){
        return veiculoService.listVeiculos();
    }

    @DeleteMapping("veiculo/{id}")
    public List<Veiculo> deleteVeiculo(@PathVariable("id")Long id){
        return veiculoService.deleteVeiculos(id);
    }

    @PutMapping("veiculo/{id}")
    public Veiculo updateVeiculo(@PathVariable("id")Long id,@RequestBody Veiculo veiculo){
        return veiculoService.updateVeiculo(veiculo);
    }
}

