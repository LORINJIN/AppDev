/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lian
 */
public class Factory {
    
     public static Wheel makeWheel (float diameter, float width) {
        return new CarWheel(diameter, width);
    }
}
    

