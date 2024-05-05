package projetoConversorMoeda.conversaoOrganizada;

import java.util.Scanner;

public class Menu {
    static int exibirMenu(Scanner leitura) {
        String texBlock = """
                             
            ********************************************************************
            Seja bem vindo ao conversor de moedas
                             
            1) USD-Dolar --> BRL-Real brasileiro
            2) BRL-Real brasileiro --> USD-Dolar
            3) AED-Dirham dos Emirados Árabes Unidos --> BRL-Real brasileiro
            4) BRL-Real brasileiro --> AED-Dirham dos Emirados Árabes Unidos
            5) AFN-Afghani AFEGANISTÃO --> BRL-Real brasileiro
            6) BRL-Real brasileiro --> AFN-Afghani AFEGANISTÃO
            7) Sair
                             
            Escololha uma opção valida!
            ********************************************************************
            """;
        System.out.println(texBlock);
        return leitura.nextInt();
    }

}
