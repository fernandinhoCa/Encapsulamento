/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando.capeletti
 */
public class agenda {
    private int dia;
    private int mes;
    private int ano;
    String anotacao;
    
    void anotar(int d, int m, String nota){
        dia=d;
        mes=m;
        anotacao=nota;
    }
    
    private void validaData(){
        if((dia<1)||(dia>31)||(mes>12)){
            dia=0;
            mes=0;
            anotacao = "Anotação não inserida devido a data inválida";
        }
    }
    
    public void mostraAnotacao(){
        System.out.println(dia+"/"+mes+" : "+anotacao);
    }
}
