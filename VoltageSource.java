/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author RaeinLayeghPour
 */
public class VoltageSource {
    private double voltage; 
    private int id = 0;
    private static int nextId = 1;
    private Node node1 = new Node();
    private Node node2 = new Node();
    
    public VoltageSource(double voltage, Node node1, Node node2){
        
        if(node1==null || node2==null) {
            throw new IllegalArgumentException("The Voltage Source should be connected!");
        }
        if(node1.equals(node2)) {
            throw new IllegalArgumentException("The Voltage Source should be connected to two different node!");
        }
        if(this.node1.id > this.node2.id) {
            this.node1 = node1;
            this.node2 = node2;
            this.voltage = -1*voltage;
        } else if(this.node1.id<this.node2.id){
            this.node1 = node1;
            this.node2 = node2;
            this.voltage = voltage;
        }
        
        this.id += this.nextId;
        this.nextId ++;
    }
    public Node [] getNodes() {
        Node [] nodes = new Node[2]; 
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }
    @Override
    public String toString(){
        return "V" + "" + this.id + " " + this.node1 + " " + this.node2 + " DC " + this.voltage;
    }
}
