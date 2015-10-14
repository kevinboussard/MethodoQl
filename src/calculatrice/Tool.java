/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

import java.util.Scanner;

/**
 *
 * @author kevin
 * Class which includs method for save an input 
 */
public class Tool {
    
    /**
     *
     * @return long
     * Save and return the User input
     */
    public long keyboarding (){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        long str = sc.nextLong();
        
        return str;
    }
    
}
