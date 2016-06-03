package prangerz54.kusmartparking.Parking;

/**
 * Created by PrangerZ54 on 5/13/2016 AD.
 */
public class Parking {

    private String name;
    private double distance;

    public Parking(String name,double distance){
        this.name = name;
        this.distance = distance;
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

    public String toString(){
        return "Name: " + name + " Distance: " + distance;
    }
}
