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
public class ObservadorGrafico extends Observador{
    
    public ObservadorGrafico(DadosObservados dados) {
        super(dados);
    }

    @Override
    public void update() {
        
        System.out.println("\nObservador 2 - Gráfico de Barra: ");
        
        System.out.print("Valor A: ");
        for(int i = 0; i < dados.getState().valorA; i++){
            System.out.print("=");
        }
        System.out.println("");
        
        System.out.print("Valor B: ");
        for(int i = 0; i < dados.getState().valorB; i++){
            System.out.print("=");
        }
        System.out.println("");
        
        System.out.print("Valor C: ");
        for(int i = 0; i < dados.getState().valorC; i++){
            System.out.print("=");
        }
        System.out.println("");
        

    }
}
