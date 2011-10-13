/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100039d_test_java;

/**
 *
 * @author hp
 */
public class Vehicle{
    
    private String name;
    private String Brand;
    private String vehicleNum;
    private int numOfWheels;

   public Vehicle(String nm,String brand,String vNum,int wheels){
       this.Brand = brand;
       this.name = nm;
       this.vehicleNum = vNum;
       this.numOfWheels = wheels;
   }

    public String getBrand() {
        return Brand;
    }

    public String getName() {
        return name;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

}
