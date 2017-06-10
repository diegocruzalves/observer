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
public abstract class Observador {
    
    protected DadosObservados dados;
    
    public Observador(DadosObservados dados){
        this.dados = dados;
    }
    
    public abstract void update();
    
}
