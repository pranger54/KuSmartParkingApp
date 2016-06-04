package prangerz54.kusmartparking.Models;

import java.io.Serializable;

/**
 * Created by PrangerZ54 on 5/13/2016 AD.
 */
public abstract class Parking implements Serializable {

    private String name;
    private double distance;
    private int price;

    public Parking(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
      this.distance = distance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return "Name: " + name + " Distance: " + distance;
    }
}
