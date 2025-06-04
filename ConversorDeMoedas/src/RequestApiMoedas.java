import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class RequestApiMoedas {
    public RequestApiMoedas() throws IOException, InterruptedException {
    }

    public static void converterMoeda(String moeda1, String moeda2) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/47e7821b31be15690c4090c6/latest/" + moeda1))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String moedas = response.body();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonMoedas minhasMoedas = gson.fromJson(moedas, JsonMoedas.class);
            ConversionRates conversion = minhasMoedas.conversion_rates();
            double valorMoeda = 0;
            switch (moeda2) {
                case "ARS":
                    valorMoeda = conversion.ars();
                    break;
                case "BRL":
                    valorMoeda = conversion.brl();
                    break;
                case "COP":
                    valorMoeda = conversion.cop();
                    break;
                case "EGP":
                    valorMoeda = conversion.egp();
                    break;
                case "EUR":
                    valorMoeda = conversion.eur();
                    break;
                case "JPY":
                    valorMoeda = conversion.jpy();
                    break;
                case "KES":
                    valorMoeda = conversion.kes();
                    break;
                case "GTQ":
                    valorMoeda = conversion.gtq();
                    break;
                case "USD":
                    valorMoeda = conversion.usd();
                    break;
            }
            System.out.println("Digite o valor que deseja converter: ");
            Scanner entrada = new Scanner(System.in);
            double valor = entrada.nextDouble();
            System.out.println("Valor " + valor + " [" + moeda1.toUpperCase() + "] " + "corresponde ao valor final de =>>> " +
                    (valorMoeda*valor) + " [" + moeda2.toUpperCase() + "]");


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }}}