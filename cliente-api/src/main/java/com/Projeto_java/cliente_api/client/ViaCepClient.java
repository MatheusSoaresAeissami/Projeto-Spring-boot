package com.seuprojeto.clienteapi.client;

import com.seuprojeto.clienteapi.dto.EnderecoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ViaCepClient {

    private static final String URL = "https://viacep.com.br/ws/{cep}/json/";
    private final RestTemplate restTemplate;

    public ViaCepClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public EnderecoDTO buscarEnderecoPorCep(String cep) {
        String uri = UriComponentsBuilder.fromUriString(URL)
                .buildAndExpand(cep)
                .toUriString();

        try {
            return restTemplate.getForObject(uri, EnderecoDTO.class);
        } catch (RestClientException e) {
            throw new IllegalStateException("Erro ao buscar endereço: " + e.getMessage(), e);
        }
    }
}
