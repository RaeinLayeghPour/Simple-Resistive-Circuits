/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author RaeinLayeghPour
 */
public class Node {
   public int id =0; // id of node
   private static int nextId = 0; // id of the next node
    
    public Node(){
        
        this.id = nextId;
        this.nextId = this.id +1; //goes up by one every time an instance of this class is made
    }
    
    
    
   
   @Override
   public String toString(){
      return ("" + this.id);
   }
}
