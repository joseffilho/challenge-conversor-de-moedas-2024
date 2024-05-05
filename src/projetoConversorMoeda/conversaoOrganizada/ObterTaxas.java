package projetoConversorMoeda.conversaoOrganizada;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObterTaxas {
    static JsonObject getExchangeRates(String moedaBase, String chave) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + chave + "/latest/" + moedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), JsonObject.class);
    }

}
