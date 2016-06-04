package prangerz54.kusmartparking.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PrangerZ54 on 6/4/2016 AD.
 */
public class ParkingList {
    private List<Parking> NewCarpark;
    private String carparkTitle;



    public ParkingList(String carparkTitle){

        this.carparkTitle = carparkTitle;
        this.NewCarpark = new ArrayList<Parking>();
    }

    public void setParkingListTitle(String carparkTitle){
        this.carparkTitle = carparkTitle;
    }

    public String getParkingListTitle(){
        return carparkTitle;
    }

    public List<Parking> getNewParkingList(){
        return NewCarpark;
    }


    public void addParkingList(Parking park) {
        NewCarpark.add(park);
    }



}
