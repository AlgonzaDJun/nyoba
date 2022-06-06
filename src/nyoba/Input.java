/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyoba;

/**
 *
 * @author Arjunnn
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author viandwi24
 */
public class Input {
    
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public String get(String text) {
        String input;
        System.out.print(text);
        try {
            input = this.br.readLine();
        } catch (IOException exception) {
            input = null;
        }
        return input;
    }
    
}