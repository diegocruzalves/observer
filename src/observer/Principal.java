/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Random;

/**
 *
 * @author diegocruzalves
 */
public class Principal {

    public static void main(String[] args) {
        
        Random numeroAleatorio = new Random();
        int a, b, c;
        a = numeroAleatorio.nextInt(20);
        b = numeroAleatorio.nextInt(20);
        c = numeroAleatorio.nextInt(20);
        
        DadosObservados dadosAplicacao = new DadosObservados();

        ObservadorTabela tabela = new ObservadorTabela(dadosAplicacao);
        ObservadorGrafico grafico = new ObservadorGrafico(dadosAplicacao);
        
        dadosAplicacao.attach(tabela);
        dadosAplicacao.attach(grafico);
        
        dadosAplicacao.setState(new Dados(a, b, c));
        
        System.out.println("\n-------------------------"
                + "\nMudança de Estado...\n"
                + "-------------------------\n");
        
        a = numeroAleatorio.nextInt(20);
        b = numeroAleatorio.nextInt(20);
        c = numeroAleatorio.nextInt(20);
        
        dadosAplicacao.setState(new Dados(a, b, c));
        

    }

}
