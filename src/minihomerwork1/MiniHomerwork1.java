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
        boolean valid = false;

        do{
            username = myInput.getUserText("Enter your name. To Join the Club: ");
            username = username.toUpperCase();
            
            if(username.startsWith("B")){
                System.out.println("You can join the club");
            }
            else if(username.startsWith("S")){
                System.out.println("You can join the club");
            }
            else if(username.startsWith("A")){
                System.out.println("You can join the club");
            }
            else{
                valid = true;
                System.out.println("Soory,No Entry. Please enter your name again");
                System.out.println(" ");
            }
        }while(Valid);
    }
    
}
