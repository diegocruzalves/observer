/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author diegocruzalves
 */
public class DadosObservados {
    protected Dados dados;
    protected ArrayList<Observador> observadores = new ArrayList<Observador>();
    public void attach(Observador observador){
        observadores.add(observador);}
    public void detach(int indice){
        observadores.remove(indice);}
    public void setState(Dados dados){
        this.dados = dados;   
        //Notifica os Observadores sobre a mudança de estado
        notificaObservadores();}
    private void notificaObservadores(){
        for(Observador observador : observadores){
            observador.update();}
    }
    public Dados getState(){
        return dados;}
}
