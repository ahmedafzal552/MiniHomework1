/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomerwork1;

import ioutils.IOUtils;

/**
 *
 * @author ahmed
 */
public class MiniHomerwork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IOUtils myInput = new IOUtils();
        
        String username;
        
        username = myInput.getUserText("Enter your name. To Join the Club: ");
        username = username.toUpperCase();
        
        if(username.startsWith("B")){
            
            System.out.println("You can join the club");
        }
        else{
            //its not b
            System.out.println("No Entry");
        }
    }
    
}
