package projetoConversorMoeda.conversaoOrganizada;

import java.util.Scanner;

public class Conversor {
    static void realizarConversao(int numeroDigitado, double conversor, double moeda1, double moeda2, double moeda3, double moeda4, Scanner leitura) {
        double moedaDestino = 0;
        switch (numeroDigitado) {
            case 1:
                moedaDestino = conversor / moeda1 * moeda2;
                System.out.println(conversor + " Em Dolar, equivale a: " + moedaDestino + " Em reais");
                break;
            case 2:
                moedaDestino = conversor / moeda2 * moeda1;
                System.out.println(conversor + " Em Reais, equivale a: " + moedaDestino + " Em Dolar");
                break;
            case 3:
                moedaDestino = conversor / moeda3 * moeda2;
                System.out.println(conversor + " Em Dirham dos Emirados Árabes, equivale a: " + moedaDestino + " Em Reais");
                break;
            case 4:
                moedaDestino = conversor / moeda2 * moeda3;
                System.out.println(conversor + " Em Reais, equivale a: " + moedaDestino + " Em Dirham dos Emirados Árabes");
                break;
            case 5:
                moedaDestino = conversor / moeda4 * moeda2;
                System.out.println(conversor + " Em Afghani AFEGANISTÃO, equivale a: " + moedaDestino + " Em Reais");
                break;
            case 6:
                moedaDestino = conversor / moeda2 * moeda4;
                System.out.println(conversor + " Em Reais, equivale a: " + moedaDestino + " Em Afghani AFEGANISTÃO");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

}
