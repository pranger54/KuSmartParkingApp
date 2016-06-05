package prangerz54.kusmartparking.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Collection;
import java.util.List;

import prangerz54.kusmartparking.Models.Parking;
import prangerz54.kusmartparking.Models.ParkingList;
import prangerz54.kusmartparking.Models.Storage;
import prangerz54.kusmartparking.R;

/**
 * Created by PrangerZ54 on 6/3/2016 AD.
 */
public class FindAvailableCarpark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_carpark);
        initComponents();

    }

    public void initComponents(){

    }
}
