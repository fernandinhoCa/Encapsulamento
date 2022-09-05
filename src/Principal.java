/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando.capeletti
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                agenda agenda1 = new agenda();
        agenda agenda2 = new agenda();
        
        agenda1.anotar(12, 10, "Dia da criança!");
        agenda2.anotar(12, 15, "Natal!");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
               
        
        agenda2.mostraAnotacao();
    }
    
}
