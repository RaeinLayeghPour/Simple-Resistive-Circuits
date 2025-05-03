/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author RaeinLayeghPour
 */
public class Resistor {
    private double resistance; //resistance
    private int id = 0; // id of resistor
    private static int nextId = 1;
    private Node node1 = new Node(); //nodes
    private Node node2 = new Node();
    
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance<0) {
                throw new IllegalArgumentException("resistance can not be negative!");
        }
        if(node1==null || node2==null) {
                throw new IllegalArgumentException("The resistor should be connected!");
        }
        if(node1.equals(node2)) {
                throw new IllegalArgumentException("The resistor should be connected to two different node!");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.id += this.nextId; 
        this.nextId ++; //increase by one everytime the instance is called
    }
    
    public Node [] getNodes() {
        Node [] nodes = new Node[2]; 
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }
    
    @Override
    public String toString(){
        return "R" + "" + this.id + " " + this.node1 + " " + this.node2 + " " + this.resistance;
    }
}
