package com.projeto.restservice.Controller;

import com.projeto.restservice.Exceptions.ProcessoJaExisteException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ProcessoControllerTest {

    @Test
    void salvaProcesso() throws ProcessoJaExisteException {

        HttpClient httpClient = HttpClientBuilder.create().build();

        try {
            JSONObject json = new JSONObject();
            json.put("numero", "gfd");
            json.put("reu", "Teste");

            HttpPost request = new HttpPost("http://localhost:8081/processo");
            request.addHeader("content-type", "application/json");

            request.setEntity(new StringEntity(json.toString()));

            HttpResponse response = httpClient.execute(request);

            assertEquals(response.getStatusLine().getStatusCode(), 400);

            json = new JSONObject();
            json.put("numero", 1524);
            json.put("reu", "Teste");

            request.setEntity(new StringEntity(json.toString()));

            response = httpClient.execute(request);

            assertEquals(response.getStatusLine().getStatusCode(), 200);

        } catch (Exception ex) {
        }

    }

    @Test
    void atualizaProcesso() {
    }

    @Test
    void deletaProcesso() {
    }
}