package br.com.autoscore.desafiobackendjr.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.autoscore.desafiobackendjr.dto.VeiculoDto;
import br.com.autoscore.desafiobackendjr.entity.Veiculo;

@FeignClient(url = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=",name = "ApiVeiculos")
public interface ApiVeiculos {

    @GetMapping("{veiculo}")
    VeiculoDto veiculoDto(@RequestParam("placa") String placa, @RequestParam("key") String key);


}

