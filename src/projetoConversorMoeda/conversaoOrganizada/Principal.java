package projetoConversorMoeda.conversaoOrganizada;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.Scanner;

import static projetoConversorMoeda.conversaoOrganizada.Conversor.realizarConversao;
import static projetoConversorMoeda.conversaoOrganizada.Menu.exibirMenu;
import static projetoConversorMoeda.conversaoOrganizada.ObterTaxas.getExchangeRates;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String moedaBase = "USD";
        String chave = "602232d99efa838a1813dc37";

        JsonObject jsonObject = getExchangeRates(moedaBase, chave);
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        double moeda1 = conversionRates.get("USD").getAsDouble();
        double moeda2 = conversionRates.get("BRL").getAsDouble();
        double moeda3 = conversionRates.get("AED").getAsDouble();
        double moeda4 = conversionRates.get("AFN").getAsDouble();

        Scanner leitura = new Scanner(System.in);
        int numeroDigitado;
        double conversor;

        do {
            numeroDigitado = exibirMenu(leitura);
            if (numeroDigitado == 7) {
                break;
            }

            System.out.println("Digite quanto você quer converter: ");
            conversor = leitura.nextDouble();

            realizarConversao(numeroDigitado, conversor, moeda1, moeda2, moeda3, moeda4, leitura);
        } while (true);

        System.out.println("Programa encerrado.");
    }

}
