package br.com.autoscore.desafiobackendjr.controller;

import org.springframework.web.bind.annotation.GetMapping;

import br.com.autoscore.desafiobackendjr.service.ApiStore;

public class ApiScoreController {
     private final ApiStore apiService;

    public ApiScoreController(ApiStore apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/score")
    public String fetchData() {
        String apiUrl = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=";
        return apiService.fetchDataFromApi(apiUrl);
    }
}
