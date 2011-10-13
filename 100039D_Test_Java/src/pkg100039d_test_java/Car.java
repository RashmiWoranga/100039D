/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100039d_test_java;

/**
 *
 * @author hp
 */
public class Car extends Vehicle{
    
    private boolean isRoofAvailable;
    private int maxSpeed;
    
    public Car(boolean roof, int speed,String brnd,String vNum){
        super("Car",brnd,vNum,4);
        this.isRoofAvailable = roof;
        this.maxSpeed = speed;
    
    }
    public void show(){
        System.out.println("Your Car is "+this.getVehicleNum()+" "+ this.getBrand() + " and high speed is "+this.getMaxSpeed()+" mph.");
    }
    public boolean isIsRoofAvailable() {
        return isRoofAvailable;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
      
}
