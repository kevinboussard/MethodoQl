/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

/**
 *
 * @author kevin
 */
public class Calculatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaration variable
        long result;
        
        // Instantiating classes
        Function f = new Function();
        Tool t = new Tool();
        
        // The User input
        long numberOne = t.keyboarding();
        long numberTwo = t.keyboarding();
        
        // Call to Addition Method and Display the result
        result = f.addition(numberOne, numberTwo);
        System.out.println("Le resultat de l'addition est : " + result );
        // Call to Multiplication Method and Display the result
        result = f.multiplication(numberOne, numberTwo);
        System.out.println("Le resultat de la multiplication est : " + result );
    }
    
}
