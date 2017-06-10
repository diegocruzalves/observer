/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author diegocruzalves
 */
public class ObservadorTabela extends Observador {
    
    public ObservadorTabela(DadosObservados dados) {
        super(dados);
    }
    @Override
    public void update() {
        System.out.println("Observador 1 - Tabela:\nValor A: " + dados.getState().valorA
                + "\nValor B: " + dados.getState().valorB + "\nValor C: "
                + dados.getState().valorC);
    }
    
}
