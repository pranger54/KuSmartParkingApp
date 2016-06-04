package prangerz54.kusmartparking.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import prangerz54.kusmartparking.Adapter.CarparkAdapter;
import prangerz54.kusmartparking.Models.Parking;
import prangerz54.kusmartparking.Models.Storage;
import prangerz54.kusmartparking.R;

/**
 * Created by PrangerZ54 on 6/3/2016 AD.
 */
public class Lowprice extends AppCompatActivity {

    private int indexList;
    private List<Parking> carpark;
    private ListView carparkListView;
    private CarparkAdapter carparkAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowprice);
        indexList = this.getIntent().getIntExtra("i", -1);
        initComponents();
    }

    protected void onStart(){
        super.onStart();
        carpark.clear();
        for(Parking thisCarpark : Storage.getInstance().loadSavedParking().get(indexList).getNewParkingList()) {
            carpark.add(thisCarpark);
        }
        carparkAdapter.notifyDataSetChanged();

    }

    public void initComponents(){
        carpark = new ArrayList<Parking>();
        carparkAdapter= new CarparkAdapter(this,R.layout.parking_cell,carpark);
        carparkListView = (ListView)findViewById(R.id.carparkListView);
        carparkListView.setAdapter( carparkAdapter );


    }


}
