package prangerz54.kusmartparking.Models;

/**
 * Created by PrangerZ54 on 6/4/2016 AD.
 */
public class Argoparking extends Parking {
    public Argoparking(){
        this.setName("Argoparking");
        this.setPrice(0);
        this.setDistance((int)Math.random());
        this.toString();
    }

}
