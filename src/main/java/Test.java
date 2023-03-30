/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lian
 */
public class Test {
    
  
    public static void main(String args[]) {
    
        Wheel carWheel = WheelFactory.makeWheel(15, 215);
  
        System.out.println(carWheel.getDiameter());
        System.out.println(carWheel.getWidth());
    }
}
    

