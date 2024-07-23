package main;

import reprodutor.ReprodutorMusical;
import reprodutor.ReprodutorMusicalImpl;
import telefone.AparelhoTelefonico;
import telefone.AparelhoTelefonicoImpl;
import navegador.NavegadorInternet;
import navegador.NavegadorInternetImpl;

// Classe principal para testar a funcionalidade
public class Main {
    public static void main(String[] args) {
        // Criando instâncias das implementações
        ReprodutorMusical meuReprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico meuTelefone = new AparelhoTelefonicoImpl();
        NavegadorInternet meuNavegador = new NavegadorInternetImpl();

        // Testando Reprodutor Musical
        System.out.println("** Reprodutor Musical **");
        meuReprodutor.selecionarMusica("Bohemian Rhapsody");
        meuReprodutor.tocar();
        meuReprodutor.pausar();

        // Testando Aparelho Telefônico
        System.out.println("\n** Aparelho Telefônico **");
        meuTelefone.ligar("555-1234");
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        System.out.println("\n** Navegador na Internet **");
        meuNavegador.exibirPagina("www.google.com");
        meuNavegador.adicionarNovaAba();
        meuNavegador.atualizarPagina();
    }
}
