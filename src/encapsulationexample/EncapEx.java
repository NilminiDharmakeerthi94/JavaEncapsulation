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
public class EncapEx {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
   
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }

}
