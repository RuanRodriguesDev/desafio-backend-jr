package br.com.autoscore.desafiobackendjr.service;

import org.springframework.web.client.RestTemplate;

public class ApiStore {
      private final RestTemplate restTemplate;

    public ApiStore(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchDataFromApi(String apiUrl) {
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
