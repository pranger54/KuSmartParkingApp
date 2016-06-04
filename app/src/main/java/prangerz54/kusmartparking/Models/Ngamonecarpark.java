package prangerz54.kusmartparking.Models;

/**
 * Created by PrangerZ54 on 6/4/2016 AD.
 */
public class Ngamonecarpark extends Parking {

    public Ngamonecarpark(String name, double distance) {
        this.setName("Ngamwongwan");
        this.setPrice(30);
        this.setDistance((int)Math.random());
        this.toString();
    }
}
