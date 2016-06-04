package prangerz54.kusmartparking.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PrangerZ54 on 6/4/2016 AD.
 */
public class Storage {
    private List<ParkingList> SavedPark;
    private static Storage instance;

    private Storage() {
        SavedPark = new ArrayList<ParkingList>();
    }

    public static Storage getInstance(){

        if(instance==null){
            instance = new Storage();
        }
        return instance;
    }


    public void savePark(ParkingList park){

        SavedPark.add(park);
    }

    public List<ParkingList> loadSavedParking(){

        return SavedPark;
    }

    public void clearParking(){
        SavedPark.clear();
    }

    public void deleteParking(List<ParkingList> park){

        for(int i =0;i<SavedPark.size();i++){
            park.get(i).getNewParkingList().clear();
        }

    }
}
