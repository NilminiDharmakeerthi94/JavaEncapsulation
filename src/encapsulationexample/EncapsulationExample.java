/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationexample;

/**
 *
 * @author Nilmini
 */
public class EncapsulationExample {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
        EncapEx en=new EncapEx();
        en.setName("jeni");
        en.setAge(23);
        System.out.println("Name:" + en.getName() +  " Age:" + en.getAge());
        
        
        // TODO code application logic here
    }
    
}
    

