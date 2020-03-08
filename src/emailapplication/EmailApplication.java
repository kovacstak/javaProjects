/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapplication;

/**
 *
 * @author enricamelissapanjaitan
 */
public class EmailApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Email em1 = new Email("Naoya", "Kashio");
        System.out.print(em1.showInfo());
        
    }
    
}
