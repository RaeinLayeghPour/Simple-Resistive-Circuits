/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author RaeinLayeghPour
 */
public class UserMain implements UserInterface{
    
    String in = "";
    ArrayList<Object> element = new ArrayList<>();
    Scanner userIn = new Scanner(System.in);
    
    
    public void start()
    {
        display();
        run();
    }
    
    public void run(){
        while(true){
            in = userIn.nextLine().trim();
            
            if(in.equalsIgnoreCase("end")){
                end();
                break;
            } else if (in.equalsIgnoreCase("spice")) {
                spice();
            } else {
                String[] inSplit = in.split(" ");
              
            if(inSplit.length != 4){    
                System.out.println("Wrong input. Please enter in proper format.");
            } else if(in.toLowerCase().startsWith("v")) {
                    double temp;
                    Node n1 = new Node();
                    Node n2 = new Node();
                    n1.id = Integer.parseInt(inSplit[1]);
                    n2.id = Integer.parseInt(inSplit[2]);
                    temp = Double.parseDouble(inSplit[3]);
                    VoltageSource voltage = new VoltageSource(temp,n1,n2);
                    element.add(voltage);
            }  else if(in.toLowerCase().startsWith("r")) {
                    double temp;
                    Node n1 = new Node();
                    Node n2 = new Node();
                    n1.id = Integer.parseInt(inSplit[1]);
                    n2.id = Integer.parseInt(inSplit[2]);
                    temp = Double.parseDouble(inSplit[3]);
                    Resistor resistor = new Resistor(temp, n1, n2);
                    element.add(resistor);
                }
            }
        }
    }
    
    public void display(){
        System.out.println("Input:");
    }
    
    
    
    public void end(){
        System.out.println("All Done!");
    }
    public void spice(){
       for(Object a : element)
       {
           System.out.println(a);
       }
    }
    
    public static void main(String[] args)
   {
       UserMain m = new UserMain();
       m.start();
   }
}
