/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testegit;

/**
 *
 * @author PC_COLEMBI
 */
public class Testegit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa(33, "Anastácio Colembi");
        System.out.println("O seu nome é: "+p.getNome()+", e a sua idade é: "+p.getIdade());
        
    }
    
}
